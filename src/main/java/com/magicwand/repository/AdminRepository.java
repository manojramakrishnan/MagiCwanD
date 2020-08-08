package com.magicwand.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.magicwand.entity.User;

public interface AdminRepository extends JpaRepository<User,Integer> {
    
}
