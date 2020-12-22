package com.hcl.hms.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.hms.model.Physician;

@Repository
public class PhysicianDaoImpl implements PhysicianDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Physician addPhysician(Physician physician) {
		Session session = sessionFactory.getCurrentSession();
		session.save(physician);
		return physician;
	}

	@Override
	public List<Physician> getByState(String state) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("From Physician p where p.state=:state");
		query.setParameter("state", state);
		List<Physician> results = ((org.hibernate.query.Query) query).list();

		return results;
	}

	@Override
	public List<Physician> getByPlan(String plan) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("From Physician p where p.insurancePlan=:plan");
		query.setParameter("plan", plan);
		List<Physician> results = ((org.hibernate.query.Query) query).list();

		

		return results;
	}

	@Override
	public List<Physician> getByDept(String dept) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("From Physician p where p.department=:dept");
		query.setParameter("dept", dept);
		List<Physician> results = ((org.hibernate.query.Query) query).list();

		

		return results;
	}

	@Override
	public List<Physician> listPhysician(Physician physician) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("From Physician");
		List<Physician> results = ((org.hibernate.query.Query) query).list();

		

		return results;
	}
}
