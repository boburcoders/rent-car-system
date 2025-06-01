package com.company.rentaCar.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address extends AuditEntity {
    private String region;
    private String city;
    private String street;
    private int houseNumber;

    @OneToOne
    @JoinColumn(name = "user_id")
    private Users user;
}
