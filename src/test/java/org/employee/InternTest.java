package org.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InternTest {

    @Test
    void calculateBonus() {
        Intern intern = new Intern("Jordan", 200.0, "Vanier College");
        assertEquals(0, intern.calculateBonus());

    }

    @Test
    void getSchool() {
        Intern intern = new Intern("Jordan", 200.0, "Vanier College");
        assertEquals("Vanier College", intern.getSchool());
    }
}