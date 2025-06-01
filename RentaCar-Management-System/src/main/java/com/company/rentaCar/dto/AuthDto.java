package com.company.rentaCar.dto;

import com.company.rentaCar.models.enums.UserRoles;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthDto {
    private Long id;
    private String email;
    private String password;
    private UserRoles role;
}