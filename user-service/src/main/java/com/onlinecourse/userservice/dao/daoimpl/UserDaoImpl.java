package com.onlinecourse.userservice.dao.daoimpl;

import com.onlinecourse.userservice.dao.UserDao;
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

    @Override
    public void save(User userData) {
        userRepository.save(userData);
    }

    @Override
    public User searchUser(Long userId) {
        return userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("User Not Found"));
    }

    @Override
    public List<User> getAllUserData(){
        return userRepository.findAll();
    }

}
