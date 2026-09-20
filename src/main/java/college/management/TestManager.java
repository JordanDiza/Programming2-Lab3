package college.management;

import college.hr.Employee;

public class TestManager extends Employee {

    public TestManager(double salary) {
        super(salary);
    }

    public void changeMySalary() {
        salary = 100000;
    }
/*
    public void changeAnotherEmployee(Employee employee) {
        employee.salary = 100000;
    }

 */
    public static void main(String[] args) {
        TestManager manager = new TestManager(50000);
        manager.changeMySalary();
        System.out.println(manager.salary);
    }
}

// Part H
/* Because TestManager lives in a different package than Employee,
Java's protected rule only gives it access to its own inherited salary.
It can freely change its own salary (salary = 100000),
but Java stops it from reaching across package lines to touch another employee object's salary (employee.salary = 100000).
 */

