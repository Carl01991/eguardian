package com.umg.usageapp.services;


import java.util.List;

import com.umg.usageapp.models.User;

/**
 * Created by fan.jin on 2016-10-15.
 */
public interface UserService {
    User findById(Long id);
    User findByUsername(String username);
    List<User> findAll ();
}
