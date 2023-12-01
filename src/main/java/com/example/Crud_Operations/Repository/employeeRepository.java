package com.example.Crud_Operations.Repository;

import com.example.Crud_Operations.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepository extends JpaRepository<Employee,Integer> {
}
