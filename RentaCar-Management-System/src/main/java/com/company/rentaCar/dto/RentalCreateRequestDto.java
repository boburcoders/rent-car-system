package com.company.rentaCar.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RentalCreateRequestDto {
    private Long userId;
    private Long carId;
    private LocalDate rentalDate;
    private LocalDate expectedReturnDate;
    private Double rentalFee;
}
