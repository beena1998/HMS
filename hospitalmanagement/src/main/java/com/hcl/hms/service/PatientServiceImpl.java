package com.hcl.hms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.hms.dao.PatientDao;
import com.hcl.hms.model.DiagnosisDetails;
import com.hcl.hms.model.Patient;

@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientDao patientDao;

	@Override
	@Transactional
	public Patient enrollPatient(Patient patient) {

		return patientDao.enrollPatient(patient);
	}

	@Override
	@Transactional
	public List<Patient> listPatient(Patient patient) {

		return patientDao.listPatient(patient);
	}

	@Override
	@Transactional
	public List<DiagnosisDetails> viewHistory(int patientId) {

		return patientDao.viewHistory(patientId);
	}

	@Override
	@Transactional
	public Patient getPatientById(int id) {

		return patientDao.getPatientById(id);
	}

	@Override
	@Transactional
	public Patient getPatient(String email, String password) {

		return patientDao.getPatient(email, password);
	}

}
