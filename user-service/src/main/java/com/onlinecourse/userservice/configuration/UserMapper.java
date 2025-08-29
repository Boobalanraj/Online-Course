package com.onlinecourse.userservice.configuration;

import com.onlinecourse.userservice.dto.EducationDto;
import com.onlinecourse.userservice.dto.RegisterDto;
import com.onlinecourse.userservice.dto.ResponseProfileDto;
import com.onlinecourse.userservice.dto.UserDto;
import com.onlinecourse.userservice.model.Education;
import com.onlinecourse.userservice.model.User;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User registerDtoToUser(RegisterDto data);

    Education educationDtoToEducation(EducationDto educationDto);

    List<EducationDto> educationListToEducationDto(List<Education> education);

    EducationDto educationToEducationDto(Education education);


    List<ResponseProfileDto> userListToProfileDto(List<User> users);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "educationId",ignore = true)
    Education updateEducationToEducation(EducationDto educationDto, @MappingTarget Education education);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "userId",ignore = true)
    User updateUserToUser(UserDto userDto,@MappingTarget User user);

    ResponseProfileDto userToProfileDto(User userData);


}
