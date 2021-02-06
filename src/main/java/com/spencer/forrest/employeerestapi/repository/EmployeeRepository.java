package com.spencer.forrest.employeerestapi.repository;

import com.spencer.forrest.employeerestapi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
