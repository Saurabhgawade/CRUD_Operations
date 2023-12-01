package com.example.Crud_Operations.Transformers;

import com.example.Crud_Operations.Entities.Employee;
import com.example.Crud_Operations.dtos.addEmployeeDto;

public class employeeDtoToEmployee {
    public static Employee employeeDtoToEmployee(addEmployeeDto addEmployeeDto){
        Employee employee=Employee.builder()
                .employeeName(addEmployeeDto.getEmployeeName())
                .phoneNo(addEmployeeDto.getPhoneNo())
                .salary(addEmployeeDto.getSalary())
                .bloodGroup(addEmployeeDto.getBloodGroup())
                .build();
        return employee;
    }
}
