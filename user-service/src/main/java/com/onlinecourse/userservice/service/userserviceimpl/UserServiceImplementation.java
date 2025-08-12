package com.onlinecourse.userservice.service.userserviceimpl;

import com.onlinecourse.userservice.dao.UserDao;
import com.onlinecourse.userservice.dto.RegisterDto;
import com.onlinecourse.userservice.model.User;
import com.onlinecourse.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImplementation implements UserService {

    private final UserDao userDao;

    @Override
    public void save(RegisterDto data) {
        userDao.save(data);
    }

}
