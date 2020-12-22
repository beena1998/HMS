package com.hcl.hms.service;

import java.util.List;

import com.hcl.hms.model.Physician;

public interface PhysicianService {
	public abstract Physician addPhysician(Physician physician);

	public abstract List<Physician> getByState(String state);
	public abstract List<Physician> getByPlan(String plan );
	public abstract List<Physician> getByDept(String dept );
	public abstract List<Physician> listPhysician(Physician physician);
}
