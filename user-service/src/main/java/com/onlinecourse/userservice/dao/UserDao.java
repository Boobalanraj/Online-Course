package com.onlinecourse.userservice.dao;

import com.onlinecourse.userservice.dto.RegisterDto;


public interface UserDao {

    void save(RegisterDto data);

}
