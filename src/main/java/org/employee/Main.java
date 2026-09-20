package org.employee;

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

        /*
        Manager manager = new Manager(80000);
        manager.giveRaise();
        System.out.println(manager.salary);
        manager.breakSalary();
        System.out.println(manager.salary);
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

// Part E
/*
I would chose design 2
If I work overtime my overtime pay cant be a negative number
 */

// Part F
/*a protected method is better than a protected field because you can put like a rule on the method that makes it
so that the value respects a certain rule to keep realism
 */

// Part G
// so that no one cange change the name after creating the object

// Part H
/* Because TestManager lives in a different package than Employee,
Java's protected rule only gives it access to its own inherited salary.
It can freely change its own salary (salary = 100000),
but Java stops it from reaching across package lines to touch another employee object's salary (employee.salary = 100000).
 */

// Part J
/*
Every field should be private to keep the values realistic.
 */

