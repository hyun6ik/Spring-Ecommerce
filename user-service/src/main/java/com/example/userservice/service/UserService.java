package com.example.userservice.service;

import com.example.userservice.dto.UserDto;
import com.example.userservice.entity.User;

public interface UserService {

    Long createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);

    Iterable<User> getUserByAll();
}
