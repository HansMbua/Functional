package com.company;

import java.text.Format;

public class Student {
    private String firstName;
    private String lastName;
    private double salary;
    private String Department;

    public Student() {
    }

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getName(){
        return String.format("%s %s",getFirstName(),getLastName());
    }

    @Override
    public String toString() {
        return String.format("%-8s %-8s %8.2f %s",getFirstName(), getLastName(), getSalary(), getDepartment());
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
