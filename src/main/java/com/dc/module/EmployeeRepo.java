package com.dc.module;

import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Integer> {

}
