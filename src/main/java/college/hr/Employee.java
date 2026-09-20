package college.hr;

public class Employee {
    protected double salary;

    public Employee(double salary) {
        this.salary = salary;
    }
    public static void main(String[] args) {
        Employee employee = new Employee(400000);
        Payroll payroll = new Payroll();

        payroll.changeSalary(employee);
        System.out.println(employee.salary);
    }
}

