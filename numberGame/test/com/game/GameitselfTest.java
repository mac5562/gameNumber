package com.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameitselfTest {

    @Test
    void numberGenerator() {
        assertNotNull(Gameitself.numberGenerator());
    }

    @Test
    void checkerOne() {
        assertTrue(Gameitself.checkerOne("5231205661024",6));
    }

    @Test
    void chekerTwo() {
        assertTrue(Gameitself.chekerTwo("5231205661024",2));
    }

    @Test
    void decrease() {
    }
}