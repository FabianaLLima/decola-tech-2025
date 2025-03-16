package me.decolatech.avanade.decola_tech_2025.service;

import me.decolatech.avanade.decola_tech_2025.domain.Employee;
import me.decolatech.avanade.decola_tech_2025.repository.EmployeeRepository;

import java.util.List;
import java.util.NoSuchElementException;

public class EmployeeServiceImp implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImp(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee create(Employee employee) {
        if (employeeRepository.existsEmployeeByCpf(employee.getCpf())) {
            throw new IllegalArgumentException("This Employee already exists.");
        }
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee employeeFromStorage = employeeRepository.findById(employee.getId()).orElseThrow(NoSuchElementException::new);

        employeeFromStorage.setName(employee.getName());
        employeeFromStorage.setCpf(employee.getCpf());
        employeeFromStorage.setEmail(employee.getEmail());
        employeeFromStorage.setPhone(employee.getPhone());
        employeeFromStorage.setDateOfBirth(employee.getDateOfBirth());
        employeeFromStorage.setAddress(employee.getAddress());
        employeeFromStorage.setProfessionalInformation(employee.getProfessionalInformation());

        return employeeFromStorage;
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
