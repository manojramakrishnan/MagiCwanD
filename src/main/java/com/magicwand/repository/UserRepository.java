package com.magicwand.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.magicwand.entity.Registration;

public interface UserRepository extends CrudRepository<Registration,Integer> {
	
	@Query("select r from Registration r join r.plan where r.id=:id")
	public List<Registration> findByReg_Id(Integer id); 
}

