package com.onlinecourse.userservice.dao.daoimpl;

import com.onlinecourse.userservice.configuration.UserMapper;
import com.onlinecourse.userservice.dao.UserDao;
import com.onlinecourse.userservice.dto.RegisterDto;
import com.onlinecourse.userservice.model.User;
import com.onlinecourse.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserDaoImpl implements UserDao {

    private final UserRepository userRepository;

    private final UserMapper mapper;

    @Override
    public void save(RegisterDto data) {
        User saveData = mapper.registerDtoToUser(data);
        userRepository.save(saveData);
    }
}
