package com.dc.module;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeApplication {
	@Autowired
	private EmployeeRepo employeeRepo;
	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}
	@PostConstruct
	public void generateEmployees() {
		List<EmployeeEntity> employees = new ArrayList<>();

        // Add sample employees to the list
        employees.add(new EmployeeEntity(1, "Alice", 70000));
        employees.add(new EmployeeEntity(2, "Bob", 80000));
        employees.add(new EmployeeEntity(3, "Charlie", 90000));
        employeeRepo.saveAll(employees);
	}

}
