package org.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {

    @Test
    void calculateBonus() {
        Developer developer = new Developer("Jordan", 20000.00, "Java");
        assertEquals(1600.0, developer.calculateBonus());
    }

    @Test
    void getLanguage() {
        Developer developer = new Developer("Jordan", 20000.00, "Java");
        assertEquals("Java", developer.getLanguage());
    }
}