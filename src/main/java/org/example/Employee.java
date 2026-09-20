package org.example;
// Part B
public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        System.out.println("Employee Constructor");
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateBonus() {
        return salary * 0.05;
    }
}

