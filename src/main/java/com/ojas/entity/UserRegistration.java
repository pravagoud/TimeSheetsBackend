package com.ojas.entity;

import jakarta.persistence.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class UserRegistration {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	@Column(name = "emp_name")
	private String employeeName;

	@Column(name = "emp_email")
	private String email;

	@Column(name = "Password")
	private String password;

	@Column(name = "ConfirmPassword")
	private String confirmPassword;

	public UserRegistration() {
		super();
	}

	public UserRegistration(int id, String employeeName, String email, String password, String confirmPassword) {
		super();
		Id = id;
		this.employeeName = employeeName;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}
