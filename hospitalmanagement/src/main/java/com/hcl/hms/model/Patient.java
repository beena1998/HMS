package com.hcl.hms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "patient_details")
public class Patient implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "fname")
	@Size(min = 1, max = 10)
	@NotEmpty(message = "Please enter your First Name")
	private String firstName;

	@Column(name = "lname")
	@Size(min=1,max = 10)
	@NotEmpty(message = "Please enter your Last Name")
	private String lastName;

	@Column(name = "pwd")
	@Size(min = 5, max = 10)
	@NotEmpty(message = "Please enter your Password")
	private String password;

	@Column(name = "dob")
	@NotEmpty(message = "Please enter your DOB")
	private String dob;

	@Column(name = "email", unique = true, nullable = false, length = 50)
	@Email(message="Please enter your email ID")
	private String email;

	@Column(name = "number")
	@NotNull(message = "Please enter your Number")
	private Long number;

	@Column(name = "state")
	@NotEmpty(message = "Please enter your State")
	private String state;

	@Column(name = "insurance_plan")
	@NotEmpty(message = "Please enter your Insurance Plan")
	private String insurancePlan;

	public Patient() {
		super();

	}

	
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getInsurancePlan() {
		return insurancePlan;
	}

	public void setInsurancePlan(String insurancePlan) {
		this.insurancePlan = insurancePlan;
	}

}
