package com.Infotrixs.Payroll_System.Models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Entity
@Table(name = "salaries")
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int salaryId;

    float base;

    float houseRentAllow;

    float convenienceAllow;

    float PF;

    float insurance;

    float inHand;

    // relations
    @OneToOne
    @JoinColumn(name = "employee_id")
    Employee employee;
}
