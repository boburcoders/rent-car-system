package com.company.rentaCar.controllers;

import com.company.rentaCar.dto.HttpApiResponse;
import com.company.rentaCar.dto.UsersDto;
import com.company.rentaCar.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<HttpApiResponse<UsersDto>> createUser(
            @RequestBody UsersDto dto
    ) {
        HttpApiResponse<UsersDto> response = userService.createUser(dto);
        return ResponseEntity.status(response.getStatus()).body(response);
    }



}
