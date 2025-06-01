package com.company.rentaCar.dto;

import com.company.rentaCar.models.enums.CardType;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentInfoDto {
    private Long id;
    private Integer userId;
    private String cardNumber;
    private CardType cardType;
    private String expiryDate;


}