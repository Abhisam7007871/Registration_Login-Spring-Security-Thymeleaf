package com.abhishek.springboot.service;

import com.abhishek.springboot.dto.UserDto;
import com.abhishek.springboot.entity.User;

import java.util.List;

public interface  UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);


    List<UserDto> findAllUsers();


}
