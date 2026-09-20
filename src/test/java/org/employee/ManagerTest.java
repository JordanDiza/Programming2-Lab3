package org.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    @Test
    void getName () {
        Manager manager = new Manager("Jordan", 4000, 7000);
        assertEquals("Jordan", manager.getName());
    }

    @Test
    void getSalary () {
        Manager manager = new Manager("Jordan", 4000, 7000);
        assertEquals(4000, manager.getSalary());
    }

    @Test
    void calculateBonus() {
        Manager manager = new Manager("Jordan", 4000, 7000);
        assertEquals(7400 ,manager.calculateBonus());
    }

    @Test
    void getManagementAllowance() {
        Manager manager = new Manager("Jordan", 4000, 7000);
        assertEquals(7000, manager.getManagementAllowance());
    }

    @Test
    void getManagementAllowanceFalse(){
        Manager manager = new Manager("Jordan", 4000, 7000);
        assertEquals(5000,manager.getManagementAllowance());
    }

    @Test
    void giveRaise(){
        Manager manager = new Manager("Jordan", 4000, 7000);
        manager.increaseSalary(1000.0);

        assertEquals(5000, manager.getSalary());
    }
    @Test
    void giveBadRaise(){
        Manager manager = new Manager("Jordan", 4000, 7000);
        manager.increaseSalary(-1000.0);

        assertEquals(3000, manager.getSalary());
    }
}