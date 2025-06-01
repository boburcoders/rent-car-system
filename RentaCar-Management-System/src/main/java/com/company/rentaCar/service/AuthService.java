package com.company.rentaCar.service;

import com.company.rentaCar.dto.AuthDto;
import com.company.rentaCar.dto.HttpApiResponse;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    HttpApiResponse<AuthDto> registerUser(AuthDto dto);
}
