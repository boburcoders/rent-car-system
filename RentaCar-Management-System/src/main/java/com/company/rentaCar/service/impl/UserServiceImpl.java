package com.company.rentaCar.service.impl;

import com.company.rentaCar.dto.HttpApiResponse;
import com.company.rentaCar.dto.UsersDto;
import com.company.rentaCar.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Override
    public HttpApiResponse<UsersDto> createUser(UsersDto dto) {
        return null;
    }
}
