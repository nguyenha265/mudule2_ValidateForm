package com.codegym.service.impl;

import com.codegym.model.User;
import com.codegym.repository.UserReposytory;
import com.codegym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    UserReposytory userReposytory;


    @Override
    public void save(User user) {
        userReposytory.save(user);
    }
}
