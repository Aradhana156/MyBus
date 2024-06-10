package com.anu.mybus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anu.mybus.dto.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> 
{

	boolean existsByEmail(String email);

	boolean existsByMobile(long mobile);
}
