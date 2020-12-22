package com.hcl.hms.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.hms.model.DiagnosisDetails;
@Repository
public class DiagnosisDaoImpl implements DiagnosisDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public DiagnosisDetails addDetails(DiagnosisDetails details) {
		
		Session session = sessionFactory.getCurrentSession();
		session.save(details);
		return details;
	}

}
