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


