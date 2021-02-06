package com.spencer.forrest.employeerestapi.service;

import com.spencer.forrest.employeerestapi.dto.EmployeeDTO;
import com.spencer.forrest.employeerestapi.exception.NotFoundException;
import com.spencer.forrest.employeerestapi.entity.Employee;
import com.spencer.forrest.employeerestapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result = employeeRepository.findById(id);

        Employee employee;

        if(result.isPresent()) {
            employee = result.get();
        }
        else {
            throw new NotFoundException("Employee not found for id: " + id);
        }

        return employee;
    }

    @Override
    public Employee save(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setId(employeeDTO.getId());
        employee.setFirstName(employeeDTO.getFirstName());
        employee.setLastName(employeeDTO.getLastName());
        employee.setEmail(employeeDTO.getEmail());

        return employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int id) {
        // check if employee is in the database
        findById(id);
        // remove employee
        employeeRepository.deleteById(id);
    }
}
