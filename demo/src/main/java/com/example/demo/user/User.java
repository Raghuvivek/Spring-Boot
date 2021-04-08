package com.example.demo.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
@Entity
public class User {
	
	public User() {
	super();
	// TODO Auto-generated constructor stub
}
	public User(int id, String name, Date birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthdate;
	}

	

	@Id
	@GeneratedValue
	private Integer id;
	@Size(min=2)
	private String name;
	@Past
	private Date birthDate;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthdate() {
		return birthDate;
	}
	public Integer getId() {
		return id;
	}

	public void setBirthdate(Date birthdate) {
		this.birthDate = birthdate;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthdate=" + birthDate + "]";
	}
	
	
	
}
