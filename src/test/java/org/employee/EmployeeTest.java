package org.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

        @Test
        void getName () {
            Employee employee = new Employee("Jordan", 1000);
            assertEquals("Jordan", employee.getName());
        }

        @Test
        void getNameWrong(){
            Employee employee = new Employee("Jordan", 1000);
            assertEquals("Bob", employee.getName());
        }

        @Test
        void getSalary () {
            Employee employee = new Employee("Jordan", 1000);
            assertEquals(1000, employee.getSalary());
        }
        @Test
        void getSalaryWrong(){
            Employee employee = new Employee("Jordan", 1000);
            assertEquals(10, employee.getSalary());
        }

        @Test
        void calculateBonus () {
            Employee employee = new Employee("Jordan", 1000);
            assertEquals(50, employee.calculateBonus());
        }
}