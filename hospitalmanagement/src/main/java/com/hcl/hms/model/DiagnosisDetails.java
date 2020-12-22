package com.hcl.hms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "diagnosis_details")
public class DiagnosisDetails {

	
	@Id
	@Column(name = "dID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int diagnosisId;
	
	@NotNull(message = "Please enter Id")
	private int patientId;
	
	@NotEmpty(message = "Please enter symptoms")
	private String symptoms;

	@NotEmpty(message = "Please enter Diagnosis Provided")
	private String diagnosisProvided;

	@NotEmpty(message = "Please enter Physician ID")
	private String administratedBy;

	@NotEmpty(message = "Please enter Date of Diagnosis")
	private String DOD;

	@NotNull(message = "Please enter whether follow-up required or not")
	private boolean followUpRequired;

	@NotEmpty(message = "Please enter Date of Follow-up")
	private String DOF;

	@NotNull(message = "Please enter bill amount")
	private float bill;

	@NotEmpty(message = "Please enter your card number")
	private String cardNo;

	@NotEmpty(message = "Please enter Mode of payment")
	private String modeOfPayment;

	public DiagnosisDetails() {
		super();

	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public int getDiagnosisId() {
		return diagnosisId;
	}

	public void setDiagnosisId(int diagnosisId) {
		this.diagnosisId = diagnosisId;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public String getDiagnosisProvided() {
		return diagnosisProvided;
	}

	public void setDiagnosisProvided(String diagnosisProvided) {
		this.diagnosisProvided = diagnosisProvided;
	}

	public String getAdministratedBy() {
		return administratedBy;
	}

	public void setAdministratedBy(String administratedBy) {
		this.administratedBy = administratedBy;
	}

	public String getDOD() {
		return DOD;
	}

	public void setDOD(String dOD) {
		DOD = dOD;
	}

	public boolean isFollowUpRequired() {
		return followUpRequired;
	}

	public void setFollowUpRequired(boolean followUpRequired) {
		this.followUpRequired = followUpRequired;
	}

	public String getDOF() {
		return DOF;
	}

	public void setDOF(String dOF) {
		DOF = dOF;
	}

	public float getBill() {
		return bill;
	}

	public void setBill(float bill) {
		this.bill = bill;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
}
