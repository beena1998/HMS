package com.hcl.hms.service;

import com.hcl.hms.model.Admin;

public interface AdminService {
	public abstract Admin addAdmin(Admin admin);
	public abstract Admin getAdmin(String email, String password);
}
