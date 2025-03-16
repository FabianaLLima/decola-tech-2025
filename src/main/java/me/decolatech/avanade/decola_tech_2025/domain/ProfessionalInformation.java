package me.decolatech.avanade.decola_tech_2025.domain;

import jakarta.persistence.*;

@Entity(name = "tb_professional_information")
public class ProfessionalInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String position;

    @Column(unique = true)
    private double salary;

    @Column(unique = true)
    private String dateOfJoiningTheCompany;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDateOfJoiningTheCompany() {
        return dateOfJoiningTheCompany;
    }

    public void setDateOfJoiningTheCompany(String dateOfJoiningTheCompany) {
        this.dateOfJoiningTheCompany = dateOfJoiningTheCompany;
    }
}
