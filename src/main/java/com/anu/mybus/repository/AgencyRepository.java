package com.anu.mybus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.anu.mybus.dto.Agency;
import com.anu.mybus.dto.Customer;

public interface AgencyRepository extends JpaRepository<Agency , Integer>
{
	boolean existsByEmail(String email);

	boolean existsByMobile(long mobile);

}
