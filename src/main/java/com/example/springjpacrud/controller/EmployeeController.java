package com.example.springjpacrud.controller;

import com.example.springjpacrud.exception.ResourceNotFoundException;
import com.example.springjpacrud.model.Employee;
import com.example.springjpacrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/v1")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getEmployees()
    {
        return employeeRepository.findAll();
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee>getEmployeeById(@PathVariable(value = "id") Long EmployeeId)
        throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(EmployeeId)
                .orElseThrow(()-> new ResourceNotFoundException("Employee not found for id::" + EmployeeId));
        return ResponseEntity.ok().body(employee);
    }

    @PostMapping("/employees")
    public Employee createEmployee(@Valid @RequestBody Employee employee)
    {
        return employeeRepository.save(employee);
    }

}
