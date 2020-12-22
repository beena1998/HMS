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
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="physician_details")
public class Physician implements Serializable{
	@Id
	@Column(name="pKey")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int primaryKey;
	
	@Column(name="Id", unique = true)
	@NotEmpty(message="Please enter ID using first two characters of Physician Id should be PR followed by a three digit")
	private String id;
	
	@NotEmpty(message="Please enter First name")
	@Size(min=3,max=20, message="First name should be between 3 and 20 characters")
	private String firstName;
	
	@NotEmpty(message="Please enter Last name")
	@Size(min=1,max=20)
	private String lastName;
	
	@NotEmpty(message="Please enter Department")
	@Size(min=3,max=20)
	private String department;
	
	@NotEmpty(message="Please enter EducationQualification")
	private String eduQul;
	
	@NotNull(message="Please enter Years of Experience")
	private int YOE;
	
	

	@NotEmpty(message="Please enter State")
	@Size(min=2,max=10)
	private String state;
	
	@NotEmpty(message="Please enter Insurance Plan")
	@Size(min=1,max=40)
	private String insurancePlan;

	public Physician() {
		super();
		
	}

	public int getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(int primaryKey) {
		this.primaryKey = primaryKey;
	}

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEduQul() {
		return eduQul;
	}

	public void setEduQul(String eduQul) {
		this.eduQul = eduQul;
	}

	public int getYOE() {
		return YOE;
	}

	public void setYOE(int yOE) {
		YOE = yOE;
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
	
	@Override
	public String toString() {
		return "Physician [primaryKey=" + primaryKey + ", Id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", department=" + department + ", eduQul=" + eduQul + ", YOE=" + YOE + ", state=" + state
				+ ", insurancePlan=" + insurancePlan + "]";
	}

}
