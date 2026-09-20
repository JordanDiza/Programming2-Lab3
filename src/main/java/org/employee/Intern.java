package org.employee;

public class Intern extends Employee {
    private String school;

    public Intern(String name, Double salary, String school){
        System.out.println("Intern Constructor");
        super(name, salary);
        this.school = school;
    }

    @Override
    public double calculateBonus() {
        return 0;
    }

    public String getSchool() {
        return school;
    }
}
