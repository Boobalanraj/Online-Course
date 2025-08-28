package com.onlinecourse.userservice.service.userserviceimpl;

import com.onlinecourse.userservice.configuration.UserMapper;
import com.onlinecourse.userservice.dao.EducationDao;
import com.onlinecourse.userservice.dao.UserDao;
import com.onlinecourse.userservice.dto.EducationDto;
import com.onlinecourse.userservice.dto.RegisterDto;
import com.onlinecourse.userservice.dto.ResponseProfileDto;
import com.onlinecourse.userservice.dto.UserDto;
import com.onlinecourse.userservice.model.Education;
import com.onlinecourse.userservice.model.User;
import com.onlinecourse.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImplementation implements UserService {

    private final UserDao userDao;

    private final EducationDao educationDao;

    private final UserMapper mapper;

    @Override
    public void save(RegisterDto data) {
        User userData = mapper.registerDtoToUser(data);
        userDao.save(userData);
    }


    @Override
    public EducationDto addEducation(EducationDto educationDto,Long userId){
        User userData = userDao.searchUser(userId);
        Education educationData = mapper.educationDtoToEducation(educationDto);
        educationData.setUser(userData);
        Education saveData = educationDao.saveEducation(educationData);
        return mapper.educationToEducationDto(saveData);
    }

    @Override
    public List<ResponseProfileDto> getAllUserData(){
        List<User> usersData = userDao.getAllUserData();
        return mapper.userListToProfileDto(usersData);
    }

    @Override
    public EducationDto updateEducation(EducationDto educationDto, Long userId, Long educationId) {
        userDao.searchUser(userId);
        Education education = educationDao.searchEducation(educationId);

        if (!education.getUser().getUserId().equals(userId)) {
            throw new RuntimeException("Education does not belong to user");
        }

        Education educationData = mapper.updateEducationToEducation(educationDto,education);
        Education saveEducationData = educationDao.saveEducation(educationData);
        return mapper.educationToEducationDto(educationData);
    }

    @Override
    public ResponseProfileDto getUserData(Long userId){
     User userData = userDao.searchUser(userId);
     return mapper.userToProfileDto(userData);
    }

    @Override
    public ResponseProfileDto updateUserData(Long userId, UserDto userDto){
        User userData = userDao.searchUser(userId);
        User updateUserData = mapper.updateUserToUser(userDto,userData);
        userDao.save(updateUserData);
        return mapper.userToProfileDto(updateUserData);
    }

}
