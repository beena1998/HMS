package com.hcl.hms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.hms.dao.DiagnosisDao;
import com.hcl.hms.model.DiagnosisDetails;
@Service
public class DiagnosisServiceImpl implements DiagnosisService {
@Autowired
private DiagnosisDao diagnosisDao;

	@Override
	@Transactional
	public DiagnosisDetails addDetails(DiagnosisDetails details) {
		
		return diagnosisDao.addDetails(details);
	}

}
