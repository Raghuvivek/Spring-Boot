package com.example.jpa.jpain10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpa.jpain10steps.entity.User;
import com.example.jpa.jpain10steps.service.UserDAOService;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner{
	
	public static final Logger log =
				LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
	@Autowired
	private UserDAOService userdaoservice;

	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jack", "Admin");
		long insert = userdaoservice.insert(user);
		log.info("User details created" + user);
	}

}
