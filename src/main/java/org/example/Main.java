package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Manager m = new Manager("John", 80000, 5001);
        System.out.println(m.getName());
        System.out.println(m.getSalary());
        System.out.println(m.getManagementAllowance());
        System.out.println(m.calculateBonus());
        // It will create an employee object and manager I think and print them

        Manager m1 = new Manager("Amanda", 80000, 5000);
        // I think it will print Employee constructor first. Since a manager is an employee.
        }
}

// Part A:
/*
A: Yes
B: No
C: No
D: Yes
 */



