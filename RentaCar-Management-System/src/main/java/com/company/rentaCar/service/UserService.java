package com.company.rentaCar.service;

import com.company.rentaCar.dto.HttpApiResponse;
import com.company.rentaCar.dto.UsersDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    HttpApiResponse<UsersDto> createUser(UsersDto dto);
}
