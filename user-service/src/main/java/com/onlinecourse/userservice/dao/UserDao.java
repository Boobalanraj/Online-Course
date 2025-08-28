package com.onlinecourse.userservice.dao;

import com.onlinecourse.userservice.model.User;

import java.util.List;


public interface UserDao {

    void save(User userData);

    User searchUser(Long userId);

    List<User> getAllUserData();

}
