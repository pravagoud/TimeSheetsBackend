package com.ojas.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

}
