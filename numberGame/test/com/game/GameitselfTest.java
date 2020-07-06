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

   @Test
    void aiMoveChoice(){
        assertEquals(0,Gameitself.aiMoveChoice("5230205661024"));
   }

    @Test
    void aiMoveChoice2(){
        assertEquals(1,Gameitself.aiMoveChoice("5231205661024"));
    }

   @Test
    void aiPositionChoice(){
        assertEquals(3,Gameitself.aiPositionChoice("5231205661024",0));
   }

   @Test
    void aiPositonChoice2(){
       assertEquals(2,Gameitself.aiPositionChoice("5231205661024",1));
   }
}