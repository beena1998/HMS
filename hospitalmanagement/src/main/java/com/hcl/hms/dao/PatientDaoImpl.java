package com.hcl.hms.dao;

import java.util.List;

import javax.persistence.Query;

/*import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;*/
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.hms.model.DiagnosisDetails;
import com.hcl.hms.model.Patient;
import com.hcl.hms.model.Physician;

@Repository
public class PatientDaoImpl implements PatientDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	/*private static final Logger logger = LogManager.getLogger(PatientDaoImpl.class);
	*/
	@Override
	public Patient enrollPatient(Patient patient) {
	
//		logger.info("Patient Added!! "+patient.getFname());

		Session session = sessionFactory.getCurrentSession();
		session.save(patient);
		
		return patient;
	}

	@Override
	public List<Patient> listPatient(Patient patient) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("From Patient");
		List<Patient> results =  ((org.hibernate.query.Query) query).list();
		
		for(Patient p : results){
			System.out.println("Physician List::"+p);
		}

		return results;
	}

	@Override
	public List<DiagnosisDetails> viewHistory(int patientId) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("From DiagnosisDetails d where d.patientId=:patientId");
		query.setParameter("patientId", patientId);
		List<DiagnosisDetails> results = ((org.hibernate.query.Query) query).list();

		for (DiagnosisDetails p : results) {
			System.out.println("Diagnosis Details List::" + p);
		}
		
		return results;
	}

	@Override
	public Patient getPatientById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("From Patient p where p.id=:id");
		query.setParameter("id", id);
		Patient result =   (Patient) ((org.hibernate.query.Query) query).uniqueResult();
		return result;
	}

	@Override
	public Patient getPatient(String email, String password) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("From Patient p where p.email=:email and p.password=:password");
		query.setParameter("email", email);
		query.setParameter("password", password);
		Patient result =   (Patient) ((org.hibernate.query.Query) query).uniqueResult();
		return result;
	}

}
