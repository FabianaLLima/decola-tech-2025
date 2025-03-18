package me.decolatech.avanade.decola_tech_2025.service;

import me.decolatech.avanade.decola_tech_2025.domain.Employee;

import java.util.List;

public interface EmployeeService {
    Employee create(Employee employee);

    Employee getEmployeeById(Long id);

    List<Employee> getEmployees();

    Employee updateEmployee(Long id, Employee employee);

    void deleteEmployee(Long id);
}
