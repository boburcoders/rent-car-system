package com.company.rentaCar.models;

import com.company.rentaCar.models.enums.CarType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Car extends AuditEntity {
    private String make;
    private String model;
    private int year;
    private String fuelType;
    private int seats;
    private int bags;
    private Boolean wheelDrive;

    @Column(unique = true)
    private String plateNumber;

    @Enumerated(EnumType.STRING)
    private CarType carType;

    private Boolean available = true;

    @OneToMany(mappedBy = "car",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Rental> rentals;

}
