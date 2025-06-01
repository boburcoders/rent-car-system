package com.company.rentaCar.dto;

import lombok.*;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RentalDto {
    private Long id;

    private Long userId;
    private Long carId;

    private LocalDate rentalDate;
    private LocalDate expectedReturnDate;
    private LocalDate actualReturnDate;

    private Boolean returned;

    private Double rentalFee;
    private Double lateFee;
}