package com.anu.mybus.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anu.mybus.repository.CustomerRepository;

@Repository
public class CustomerDao {

	@Autowired
	CustomerRepository customerRepository;
	
	public boolean checkEmail(String email) {
		return customerRepository.existsByEmail(email);
	}

	public boolean checkMobile(long mobile) {
		return customerRepository.existsByMobile(mobile);
	}
	
}
