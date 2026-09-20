package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Manager manager = new Manager(80000);
        manager.giveRaise();

        System.out.println(manager.salary);
        manager.breakSalary();

        System.out.println(manager.salary);

        /* System.out.println(manager.salary);
        Manager m = new Manager("John", 80000, 5001);
        System.out.println(m.getName());
        System.out.println(m.getSalary());
        System.out.println(m.getManagementAllowance());
        System.out.println(m.calculateBonus());
        // It will create an employee object and manager I think and print them

        Manager m1 = new Manager("Amanda", 80000, 5000);
        // I think it will print Employee constructor first. Since a manager is an employee.
        }
        */

    }
}

// Part A:
/*
A: Yes
B: No
C: No
D: Yes
 */

//Part D
/*
It shouldnt be protected, because anyone can modify the salary to an unrealistic number.
1. Yes, the manager class can modify the salary directly
2. Yes, because the value of breakSalary is -500000 which isnt realistic
3. No, because anyone can set the salary to -50000
4. Yes, because you can but like a limit on how low the salary can be like it has to be more than 0.
 */



