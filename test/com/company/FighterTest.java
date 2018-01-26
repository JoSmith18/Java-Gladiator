package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FighterTest {

    @Test
    void getName() {
        Fighter fighter1 = new Fighter("John");
        fighter1.setName("John");
        assertEquals("John", fighter1.getName());
    }

    @Test
    void setName() {
        Fighter fighter1 = new Fighter("John");
        fighter1.setName("John");
        assertEquals("John", fighter1.name);
    }

    @Test
    void setHealth() {
        Fighter fighter1 = new Fighter("John");
        fighter1.setHealth(10);
        Integer expected = 10;
        assertEquals(expected, fighter1.health);


    }

    @Test
    void healthCannotBeSetAbove100(){

        Fighter fighter = new Fighter("John");
        fighter.setHealth(105);
        Integer expected = 100;
        assertEquals(expected, fighter.health);
    }

    @Test
    void getRage() {
        Fighter fighter1 = new Fighter("John");
        Integer expected = 0;
        assertEquals(expected, fighter1.getRage());
        assertEquals(fighter1.rage, fighter1.getRage());
    }

    @Test
    void setRage() {
        Fighter fighter1 = new Fighter("John");
        fighter1.setRage(50);
        Integer expected = 50;
        assertEquals(expected, fighter1.getRage());
    }

    @Test
    void getLow() {
        Fighter fighter1 = new Fighter("John");
        fighter1.setLow(15);
        Integer expected = 15;
        assertEquals(expected, fighter1.getLow());
    }

    @Test
    void setLow() {
        Fighter fighter1 = new Fighter("John");
        fighter1.setLow(15);
        Integer expected = 15;
        assertEquals(expected, fighter1.getLow());
    }

    @Test
    void getHigh() {
        Fighter fighter1 = new Fighter("John");
        fighter1.setHigh(15);
        Integer expected = 15;
        assertEquals(expected, fighter1.getHigh());
    }

    @Test
    void setHigh() {
        Fighter fighter1 = new Fighter("John");
        fighter1.setHigh(15);
        Integer expected = 15;
        assertEquals(expected, fighter1.getHigh());
    }

    @Test
    void changeToStr() {
        Fighter fighter1 = new Fighter("John");

       assertEquals( ("'" + fighter1.name + '\'' + " | Health= " +
                fighter1.health +
                " | Rage= " + fighter1.rage +
                " | Low= " + fighter1.low +
                " | High= " + fighter1.high), fighter1.toString());
    }

    @Test
    void getHealth() {
        Fighter fighter1 = new Fighter("John");
        Integer expected = 100;
        assertEquals(expected,fighter1.getHealth());
    }

    @Test
    void critAttack() {
        Fighter attacker = new Fighter("John");
        Fighter defender = new Fighter("John");
        attacker.setRage(100);
        attacker.attack(defender);
        assertTrue(defender.getHealth() < 100);
        Integer expected = 0;
        assertEquals(expected, attacker.getRage());

    }

    @Test
    void attack(){
        Fighter attacker = new Fighter("John");
        Fighter defender = new Fighter("John");
        attacker.attack(defender);
        assertTrue(defender.getHealth() < 100);
        Integer expected = 15;
        assertEquals(expected, attacker.getRage());

    }

    @Test
    void heal() {
        Fighter fighter1 = new Fighter("John");
        fighter1.setRage(15);
        fighter1.setHealth(90);
        fighter1.heal();
        Integer expectedHealth = 100;
        assertEquals(expectedHealth, fighter1.getHealth());
        Integer expectedRage = 5;
        assertEquals(expectedRage, fighter1.getRage());
    }

    @Test
    void skip() {
        Fighter fighter1 = new Fighter("John");
        fighter1.skip();
        Integer expectedRage = 15;
        assertEquals(expectedRage, fighter1.getRage());
    }

    @Test
    void isDead() {
        Fighter fighter1 = new Fighter("John");
        fighter1.setHealth(0);
        assertEquals(true, fighter1.isDead());
        fighter1.setHealth(1);
        assertEquals(false, fighter1.isDead());
    }
}