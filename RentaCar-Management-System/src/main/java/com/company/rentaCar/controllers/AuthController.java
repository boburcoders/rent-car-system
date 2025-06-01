package com.company.rentaCar.controllers;

import com.company.rentaCar.dto.AuthDto;
import com.company.rentaCar.dto.AuthRequest;
import com.company.rentaCar.dto.HttpApiResponse;
import com.company.rentaCar.dto.UsersDto;
import com.company.rentaCar.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthController {
    private final AuthService authService;

    @PostMapping
    public ResponseEntity<HttpApiResponse<AuthDto>> registerUser(
            @RequestBody AuthDto dto
    ) {
        HttpApiResponse<AuthDto> response = authService.registerUser(dto);
        return ResponseEntity.status(response.getStatus()).body(response);
    }

}
