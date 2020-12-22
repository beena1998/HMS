package com.hcl.hms.dao;

import com.hcl.hms.model.Admin;

public interface AdminDao {
public abstract Admin addAdmin(Admin admin);
public abstract Admin getAdmin(String email, String password);
}
