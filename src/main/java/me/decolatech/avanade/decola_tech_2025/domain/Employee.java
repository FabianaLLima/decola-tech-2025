package me.decolatech.avanade.decola_tech_2025.domain;

import jakarta.persistence.*;

@Entity(name= "tb_employee")
public class Employee {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @Column(unique = true)
   private String name;

   @Column(unique = true)
   private String cpf;

   @Column(unique = true)
   private String email;

   @Column(unique = true)
   private String phone;

   @OneToOne(cascade = CascadeType.ALL)
   private Address address;

   @Column(unique = true)
   private String  dateOfBirth;

   @OneToOne(cascade = CascadeType.ALL)
   private ProfessionalInformation professionalInformation;

   public Long getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getCpf() {
      return cpf;
   }

   public void setCpf(String cpf) {
      this.cpf = cpf;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public Address getAddress() {
      return address;
   }

   public void setAddress(Address address) {
      this.address = address;
   }

   public String getDateOfBirth() {
      return dateOfBirth;
   }

   public void setDateOfBirth(String dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
   }

   public ProfessionalInformation getProfessionalInformation() {
      return professionalInformation;
   }

   public void setProfessionalInformation(ProfessionalInformation professionalInformation) {
      this.professionalInformation = professionalInformation;
   }
}








