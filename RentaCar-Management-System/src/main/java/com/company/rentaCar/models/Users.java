package com.company.rentaCar.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Users extends AuditEntity {
    private String fullName;
    private String phoneNumber;
    private Boolean isSenior;
    private Boolean isUzCitizen;
    private String idNumber;

    @OneToOne(mappedBy = "user",
            cascade = CascadeType.ALL)
    private Address address;

    @OneToOne(mappedBy = "user",
            cascade = CascadeType.ALL)
    private PaymentInfo paymentInfo;

    @OneToMany(mappedBy = "user",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<Rental> rentals;
}
