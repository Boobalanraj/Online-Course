package com.onlinecourse.userservice.service;

import com.onlinecourse.userservice.dto.RegisterDto;
import com.onlinecourse.userservice.model.User;

public interface UserService {

    void save(RegisterDto data);

//    public void save(User data);

}
