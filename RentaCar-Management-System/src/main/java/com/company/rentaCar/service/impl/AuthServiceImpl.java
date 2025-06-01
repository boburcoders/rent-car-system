package com.company.rentaCar.service.impl;

import com.company.rentaCar.dto.AuthDto;
import com.company.rentaCar.dto.HttpApiResponse;
import com.company.rentaCar.repository.AuthRepository;
import com.company.rentaCar.service.AuthService;
import com.company.rentaCar.service.mappers.AuthMapper;
import com.company.rentaCar.service.validations.AuthValidation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final AuthMapper authMapper;
    private final AuthValidation authValidation;
    private final AuthRepository authRepository;

    @Override
    public HttpApiResponse<AuthDto> registerUser(AuthDto dto) {
        return null;
    }
}
