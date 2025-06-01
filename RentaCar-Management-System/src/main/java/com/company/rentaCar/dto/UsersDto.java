package com.company.rentaCar.dto;

import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link com.company.rentaCar.models.Users}
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsersDto implements Serializable {
    Long id;
    String fullName;
    String phoneNumber;
    Boolean isSenior;
    Boolean isUzCitizen;
    String idNumber;

    private AddressDto address;
    private PaymentInfoDto paymentInfo;
    private List<RentalDto> rentals;
}