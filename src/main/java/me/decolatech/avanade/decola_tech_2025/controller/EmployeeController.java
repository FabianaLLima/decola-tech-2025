package me.decolatech.avanade.decola_tech_2025.controller;

import me.decolatech.avanade.decola_tech_2025.domain.Employee;
import me.decolatech.avanade.decola_tech_2025.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        Employee employeeToUpdate = employeeService.updateEmployee(id, employee);
        return ResponseEntity.ok(employeeToUpdate);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Long id) {
        Employee employee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getEmployees() {
        var employees = employeeService.getEmployees();
        return ResponseEntity.ok(employees);
    }

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        var employeeCreated = employeeService.create(employee);
        return ResponseEntity.ok(employeeCreated);
    }
}
