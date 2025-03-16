package me.decolatech.avanade.decola_tech_2025.controller;

import me.decolatech.avanade.decola_tech_2025.domain.Employee;
import me.decolatech.avanade.decola_tech_2025.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        var employeeCreated = employeeService.create(employee);
        return ResponseEntity.ok(employeeCreated);
    }
}
