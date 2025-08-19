package com.onlinecourse.userservice.dao.daoimpl;

import com.onlinecourse.userservice.configuration.UserMapper;
import com.onlinecourse.userservice.dao.UserDao;
import com.onlinecourse.userservice.dto.RegisterDto;
import com.onlinecourse.userservice.dto.ResponseProfileDto;
import com.onlinecourse.userservice.exception.customexception.UserNotFoundException;
import com.onlinecourse.userservice.model.User;
import com.onlinecourse.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Override
    public User searchUser(Long userId) {
        return userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("User Not Found"));
    }

    @Override
    public List<ResponseProfileDto> getAllUserData(){
        List<User> userData = userRepository.findAll();
        return mapper.userListToProfileDto(userData);
    }

}
