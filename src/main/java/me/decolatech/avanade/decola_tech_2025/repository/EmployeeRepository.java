package me.decolatech.avanade.decola_tech_2025.repository;

import me.decolatech.avanade.decola_tech_2025.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
