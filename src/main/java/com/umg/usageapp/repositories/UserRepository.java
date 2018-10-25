package com.umg.usageapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umg.usageapp.models.User;

/**
 * Created by fan.jin on 2016-10-15.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername( String username );
}

