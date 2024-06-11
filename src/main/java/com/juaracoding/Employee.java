package com.juaracoding;

public class Employee {

    private String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary > 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary harus lebih dari 0");
        }

    }
}
