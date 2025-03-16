package me.decolatech.avanade.decola_tech_2025.domain;

public class Employee {
   private String name;
   private String cpf;
   private String email;
   private String phone;
   private Address address;
   private String  dateOfBirth;
   private ProfessionalInformation professionalInformation;

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








