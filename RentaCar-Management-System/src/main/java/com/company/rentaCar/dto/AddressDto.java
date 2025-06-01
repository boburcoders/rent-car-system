package com.company.rentaCar.dto;

import lombok.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {
    private Long id;
    private Long userId;
    private String region;
    private String city;
    private String street;
    private int houseNumber;
}