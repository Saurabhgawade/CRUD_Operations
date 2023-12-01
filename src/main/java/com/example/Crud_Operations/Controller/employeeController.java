package com.example.Crud_Operations.Controller;

import com.example.Crud_Operations.Entities.Employee;
import com.example.Crud_Operations.Services.employeeService;
import com.example.Crud_Operations.dtos.addEmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class employeeController {
    @Autowired
    private employeeService employeeService;

    @PostMapping("/addemployee")
    public ResponseEntity<String> addEmployee(@RequestBody addEmployeeDto addEmployeeDto){
        try {
            String response = employeeService.addEmployee(addEmployeeDto);

            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/findall")
    public List<String> findallEmployee(){
        return employeeService.findallEmployee();
    }

    @PutMapping("/changeSalaryOfEmployee")
    public ResponseEntity changeSalaryOfEmployee(@RequestParam("employeeId")int employeeId,@RequestParam("salary")String salary){

        try{
            String response=employeeService.changeEmployeeSalary(employeeId,salary);
            return new ResponseEntity(response,HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/deleteById")
    public ResponseEntity deleteById(@RequestParam("employeeId")int emplyeeId){
        try{
            String response=employeeService.deleteById(emplyeeId);
            return new ResponseEntity(response,HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }






}
