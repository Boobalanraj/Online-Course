package com.onlinecourse.userservice.service.userserviceimpl;

import com.onlinecourse.userservice.dao.EducationDao;
import com.onlinecourse.userservice.dao.UserDao;
import com.onlinecourse.userservice.dto.EducationDto;
import com.onlinecourse.userservice.dto.RegisterDto;
import com.onlinecourse.userservice.dto.ResponseProfileDto;
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

    @Override
    public void save(RegisterDto data) {
        userDao.save(data);
    }


    @Override
    public EducationDto addEducation(EducationDto educationDto,Long userId){
        User data = userDao.searchUser(userId);
        return educationDao.addEducation(educationDto,data);
    }

    @Override
    public List<ResponseProfileDto> getAllUserData(){
        return userDao.getAllUserData();
    }

    @Override
    public EducationDto updateEducation(EducationDto educationDto, Long userId, Long educationId) {
        userDao.searchUser(userId);
        Education educationData = educationDao.searchEducation(educationId);

        if (!educationData.getUser().getUserId().equals(userId)) {
            throw new RuntimeException("Education does not belong to user");
        }

        return educationDao.updateEducation(educationDto,educationData);
    }

}
