//package com.example.reactspringdatarest.model;
//
//import lombok.Data;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import java.util.Objects;
//
//@Entity
//public class Employee {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id;
//    private String firstName;
//    private String lastName;
//    private String description;
//
//    private Employee() {
//    }
//
//    public Employee(String firstName, String lastName, String description) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.description = description;
//    }
//
//    // overrides for improved object comparision
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return Objects.equals(id, employee.id) &&
//                Objects.equals(firstName, employee.firstName) &&
//                Objects.equals(lastName, employee.lastName) &&
//                Objects.equals(description, employee.description);
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(id, firstName, lastName, description);
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + id +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", description='" + description + '\'' +
//                '}';
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//}
