package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void shouldReturnTrueForAdultAnimal() {
        assertTrue(Animal.isAdult(3));
    }

    @Test
    void shouldReturnFalseForYoungAnimal() {
        assertFalse(Animal.isAdult(1));
    }
}
