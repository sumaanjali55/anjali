package com.example.employee.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {
    // Marker Interface (no code needed)

}
