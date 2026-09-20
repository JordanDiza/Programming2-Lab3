package org.employee;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, Double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public double calculateBonus(){
        return getSalary() * 0.08;
    }

    public String getLanguage(){
        return programmingLanguage;
    }

}
