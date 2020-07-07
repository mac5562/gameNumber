package com.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameItselfTest {

    @Test
    void numberGenerator() {
        assertNotNull(GameItself.numberGenerator());
    }

    @Test
    void checkerOne() {
        assertTrue(GameItself.checkerOne("5231205661024",5));
    }

    @Test
    void chekerTwo() {
        assertTrue(GameItself.chekerTwo("5231205661024",3));
    }

    @Test
    void decrease() {
        assertEquals("5230205661024", GameItself.decrease("5231205661024",4));
    }

    @Test
    void removeing(){
        assertEquals("5231205661", GameItself.removeing("5231205661024",3));
    }

   @Test
    void aiMoveChoice(){
        assertEquals(0, GameItself.aiMoveChoice("5230205661024"));
   }

    @Test
    void aiMoveChoice2(){
        assertEquals(1, GameItself.aiMoveChoice("5231205661024"));
    }

   @Test
    void aiPositionChoice(){
        assertEquals(3, GameItself.aiPositionChoice("5231205661024",0));
   }

   @Test
    void aiPositonChoice2(){
       assertEquals(2, GameItself.aiPositionChoice("5231205661024",1));
   }
}