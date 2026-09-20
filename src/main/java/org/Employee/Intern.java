package org.Employee;

public class Intern extends Employee{
    private String school;

    public Intern(String name, Double salary, String school){
        super(name, salary);
        this.school = school;
    }
    @Overide
    public double calculateBonus() {
        return 0;
    }
    public String getSchool() {
        return school;
    }
}
