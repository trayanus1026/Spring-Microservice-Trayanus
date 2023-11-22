package com.trayanus.userservice.service;

import com.trayanus.userservice.dto.ResponseDto;
import com.trayanus.userservice.entity.User;

public interface UserService {
    User saveUser(User user);

    ResponseDto getUser(Long userId);
}