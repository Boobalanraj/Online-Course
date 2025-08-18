package com.onlinecourse.userservice.configuration;

import com.onlinecourse.userservice.dto.RegisterDto;
import com.onlinecourse.userservice.model.User;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface UserMapper {

    User registerDtoToUser(RegisterDto data);

}
