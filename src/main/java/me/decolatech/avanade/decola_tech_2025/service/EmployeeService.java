package me.decolatech.avanade.decola_tech_2025.service;

import me.decolatech.avanade.decola_tech_2025.domain.Employee;

public interface EmployeeService {
    Employee create(Employee employee);

    Employee getEmployeeById(Long id);

    Employee getEmployees();

    Employee updateEmployee(Employee employee);

    Employee deleteEmployee(Long id);
}
