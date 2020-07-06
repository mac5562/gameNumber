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
        assertTrue(Gameitself.checkerOne("5231205661024",5));
    }

    @Test
    void chekerTwo() {
        assertTrue(Gameitself.chekerTwo("5231205661024",3));
    }

    @Test
    void decrease() {
        assertEquals("5230205661024",Gameitself.decrease("5231205661024",4));
    }

    @Test
    void removeing(){
        assertEquals("5231205661",Gameitself.removeing("5231205661024",3));
    }

   
}