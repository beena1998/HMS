package com.hcl.hms.dao;

import java.util.List;

import com.hcl.hms.model.Physician;

public interface PhysicianDao {
	public abstract Physician addPhysician(Physician physician);
	public abstract List<Physician> listPhysician(Physician physician);
	public abstract List<Physician> getByState(String state );
	
	public abstract List<Physician> getByPlan(String plan );
	public abstract List<Physician> getByDept(String dept );

}
