package com.example.employee.service;

import org.hibernate.cache.spi.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.employee.repo.EmpRepo;
import java.util.List;
import entity.Employee;
@Service

public class Empservice {
	 @Autowired
	    private EmpRepo repo;

	    // CREATE
	    public Employee addEmployee(Employee e) {
	        return Region.save(e);
	    }

	    // READ
	    public List<Employee> getAllEmployees() {
	        return repo.findAll();
	    }

	    public Employee getEmployeeById(int id) {
	        return repo.findById(id).orElse(null);
	    }

	    // UPDATE
	    public Employee updateEmployee(Employee e) {
	        return repo.save(e);
	    }

	    // DELETE
	    public String deleteEmployee(int id) {
	            repo.deleteById(id);
	                return "Employee removed with ID: " + id;
	    }
	}
}
