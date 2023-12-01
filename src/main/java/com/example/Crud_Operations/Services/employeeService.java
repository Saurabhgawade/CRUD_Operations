package com.example.Crud_Operations.Services;

import com.example.Crud_Operations.Entities.Employee;
import com.example.Crud_Operations.Repository.employeeRepository;
import com.example.Crud_Operations.Transformers.employeeDtoToEmployee;
import com.example.Crud_Operations.dtos.addEmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class employeeService {
    @Autowired
    private employeeRepository employeeRepository;

    public String addEmployee (addEmployeeDto addEmployeeDto)throws Exception{
        Employee employee= employeeDtoToEmployee.employeeDtoToEmployee(addEmployeeDto);
        employeeRepository.save(employee);
        return "empoyee added in the Database";

    }

    public List<String> findallEmployee(){
        List<Employee>employyes=employeeRepository.findAll();
        List<String> ans=new ArrayList<>();

        for(Employee employee:employyes){
            String employeeName=employee.getEmployeeName();
            ans.add(employeeName);

        }
        return ans;

    }
    public String changeEmployeeSalary(int employeeId,String salary)throws  Exception{
        Optional<Employee>optionalEmployee=employeeRepository.findById(employeeId);

        if(!optionalEmployee.isPresent()){
            throw new Exception("Employee Id Not Exist");
        }

        Employee employee=optionalEmployee.get();

        employee.setSalary(salary);

        employeeRepository.save(employee);

        return "employee have ID"+employeeId+"change their salary to"+salary;



    }

    public String deleteById(int employeeId)throws Exception{
        employeeRepository.deleteById(employeeId);

        return "employee of Id"+employeeId+"deleted from database";





    }
}
