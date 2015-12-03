package com.students.domain;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;

public class Student {

	private int id;

	@Size(min = 4, max = 50, message = "{Size.length}")
	@Pattern(regexp = "^[a-zA-Z]*$", message = "{Pattern.name}")
	private String firstName = null;

	@Size(min = 4, max = 50, message = "{Size.length}")
	@Pattern(regexp = "^[a-zA-Z]*$", message = "{Pattern.name}")
	private String lastName = null;

	@Email(message = "{Email.invalid}")
	private String email = null;

	private String gender = null;

	@DateTimeFormat(pattern = "mm/dd/yyyy")
	private Date birthday;

	@Valid
	private Phone phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		System.out.println(phone);
		this.phone = phone;
	}

}
