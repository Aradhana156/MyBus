package com.anu.mybus.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anu.mybus.dto.Agency;
import com.anu.mybus.repository.AgencyRepository;

@Repository
public class AgencyDao {

	@Autowired
	AgencyRepository agencyRepository;
	
	public boolean checkEmail(String email) {
		return agencyRepository.existsByEmail(email);
	}

	public boolean checkMobile(long mobile) {
		return agencyRepository.existsByMobile(mobile);
	}

	public void save(Agency agency) {
		agencyRepository.save(agency);
	}
}
