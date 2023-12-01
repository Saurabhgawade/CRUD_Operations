package com.example.Crud_Operations.dtos;

import com.example.Crud_Operations.Enums.BloodGroup;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class addEmployeeDto {
    private String employeeName;

    private String salary;


    private String phoneNo;


    private BloodGroup bloodGroup;
}
