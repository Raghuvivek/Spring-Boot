package com.example.demo.user;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.apache.catalina.authenticator.SavedRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserJPAResource {
	
	@Autowired
	private UserDaoService service;
		
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/Jpa/Users")
	public List<User> retreiveAllUsers() {
	return userRepository.findAll();	
	}
	
	@GetMapping("/Jpa/Users/{id}")
	public EntityModel<User> findUser(@PathVariable int id) {
		Optional<User> user = userRepository.findById(id);
		if(!user.isPresent()) {
			throw new UserNotFoundException("id -->" + id);
		}
		//HATEOAS Spring > 2.2.0
		EntityModel<User> resource = EntityModel.of(user.get());
		
		WebMvcLinkBuilder linkTo = 
				linkTo(methodOn(this.getClass()).retreiveAllUsers());
		
		resource.add(linkTo.withRel("all-users"));
			
		/* Spring less than 2.2.0
		 * Resource<User> resource = new Resource<User>(user); ControllerLinkBuilder
		 * linkTo = linkTo(methodOn(this.getClass()).retrieveAllUsers());
		 * resource.add(linkTo.withRel("all-users"));
		 */
		return resource;
	}
	

	@PostMapping("/Jpa/User")
	public ResponseEntity saveUser(@Valid @RequestBody User user) {
		User savedUser = userRepository.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/Jpa/User/{id}")
	public void deleteUser(@PathVariable int id) {
	userRepository.deleteById(id);
		
	}
}
