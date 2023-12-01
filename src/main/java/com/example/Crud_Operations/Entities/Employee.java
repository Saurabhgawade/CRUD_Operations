package com.example.Crud_Operations.Entities;

import com.example.Crud_Operations.Enums.BloodGroup;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;

    private String employeeName;

    private String salary;

    @Column(name = "phoneNo",nullable = false,unique = true)
    private String phoneNo;

    @Enumerated(value = EnumType.STRING)
    private BloodGroup bloodGroup;




}
