package com.anurag.user.service.services;

import com.anurag.user.service.entities.User;

import java.util.List;

public interface UserService {

    //create
    User saveUser(User user);

    //get All Users
    List<User> getAllUser();

    //get single user of given userId
    User getUser(String userId);


}
