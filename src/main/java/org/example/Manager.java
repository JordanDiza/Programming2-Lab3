package org.example;
// Part B
/*
public class Manager extends Employee {
    private double managementAllowance;

    public Manager(String name, double salary, double managementAllowance) {
        super(name, salary);
        System.out.println("Manager Constructor");
        this.managementAllowance = managementAllowance;
    }

    @Override
    public double calculateBonus() {
        return (getSalary() * 0.10) + managementAllowance;
    }

    public double getManagementAllowance() {
        return managementAllowance;
    }
}
*/

class Manager extends Employee {

    public Manager(double salary) {
        super(salary);
    }

    public void giveRaise() {
        increaseSalary(1000);
    }

    public void breakSalary() {
        salary = -500000;
    }
}

