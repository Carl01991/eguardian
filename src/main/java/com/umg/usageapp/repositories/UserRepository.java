package com.umg.usageapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umg.usageapp.models.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername( String username );
}

