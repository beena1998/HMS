package com.hcl.hms.service;

import java.util.List;

import com.hcl.hms.model.DiagnosisDetails;
import com.hcl.hms.model.Patient;

public interface PatientService {
	public abstract Patient enrollPatient(Patient patient);

	public abstract List<Patient> listPatient(Patient patient);

	public abstract List<DiagnosisDetails> viewHistory(int patientId);

	public abstract Patient getPatientById(int id);

	public abstract Patient getPatient(String email, String password);

}
