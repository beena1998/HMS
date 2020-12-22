package com.hcl.hms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.hms.dao.AdminDao;
import com.hcl.hms.model.Admin;
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;
	
	@Override
	@Transactional
	public Admin addAdmin(Admin admin) {
		
		return adminDao.addAdmin(admin);
	}

	@Override
	@Transactional
	public Admin getAdmin(String email, String password) {
		
		return adminDao.getAdmin(email, password);
	}

}
