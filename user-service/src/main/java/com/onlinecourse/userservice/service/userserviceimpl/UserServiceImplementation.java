package com.onlinecourse.userservice.service.userserviceimpl;

import com.onlinecourse.userservice.model.User;
import com.onlinecourse.userservice.repository.UserRepository;
import com.onlinecourse.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImplementation implements UserService {
    private final UserRepository userRepository;

    @Override
    public void save(User data) {
        userRepository.save(data);
    }

}
