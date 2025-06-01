package com.company.rentaCar.models;

import com.company.rentaCar.models.enums.CardType;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentInfo extends AuditEntity {

    private String cardNumber;
    @Enumerated(EnumType.STRING)
    private CardType cardType;
    private String expiryDate;

    @OneToOne
    @JoinColumn(name = "user_id")
    private Users user;


}
