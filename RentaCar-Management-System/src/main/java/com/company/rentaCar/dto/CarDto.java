package com.company.rentaCar.dto;

import com.company.rentaCar.models.enums.CarType;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarDto {
    private String make;
    private String model;
    private int year;
    private String fuelType;
    private int seats;
    private int bags;
    private Boolean wheelDrive;
    private String plateNumber;
    private CarType carType;
}
