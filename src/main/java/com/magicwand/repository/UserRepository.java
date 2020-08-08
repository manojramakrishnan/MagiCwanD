package com.magicwand.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magicwand.entity.Registration;

public interface UserRepository extends JpaRepository<Registration,Integer> {
    
}

