package com.onlinecourse.userservice.dao;

import com.onlinecourse.userservice.dto.RegisterDto;
import com.onlinecourse.userservice.dto.ResponseProfileDto;
import com.onlinecourse.userservice.model.User;

import java.util.List;


public interface UserDao {

    void save(RegisterDto data);

    User searchUser(Long userId);

    List<ResponseProfileDto> getAllUserData();

}
