package com.hcl.hms.dao;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.hms.model.Admin;
import com.hcl.hms.model.Patient;

@Repository
public class AdminDaoImpl implements AdminDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Admin addAdmin(Admin admin) {
		Session session = sessionFactory.getCurrentSession();
		session.save(admin);

		return admin;
	}

	@Override
	public Admin getAdmin(String email, String password) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("From Admin a where a.email=:email and a.password=:password");
		query.setParameter("email", email);
		query.setParameter("password", password);

		Admin result = (Admin) ((org.hibernate.query.Query) query).uniqueResult();
		return result;

	}

}
