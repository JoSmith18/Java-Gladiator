package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UFCFIGHTERTest {

    @Test
    void getName() {
        UFCFIGHTER UFCFIGHTER1 = new UFCFIGHTER("John");
        UFCFIGHTER1.setName("John");
        assertEquals("John", UFCFIGHTER1.getName());
    }

    @Test
    void setName() {
        UFCFIGHTER UFCFIGHTER1 = new UFCFIGHTER("John");
        UFCFIGHTER1.setName("John");
        assertEquals("John", UFCFIGHTER1.name);
    }

    @Test
    void setHealth() {
        UFCFIGHTER UFCFIGHTER1 = new UFCFIGHTER("John");
        UFCFIGHTER1.setHealth(10);
        Integer expected = 10;
        assertEquals(expected, UFCFIGHTER1.health);


    }

    @Test
    void healthCannotBeSetAbove200(){

        UFCFIGHTER UFCFIGHTER = new UFCFIGHTER("John");
        UFCFIGHTER.setHealth(205);
        Integer expected = 200;
        assertEquals(expected, UFCFIGHTER.health);
    }

    @Test
    void getRage() {
        UFCFIGHTER UFCFIGHTER1 = new UFCFIGHTER("John");
        Integer expected = 40;
        assertEquals(expected, UFCFIGHTER1.getRage());
        assertEquals(UFCFIGHTER1.rage, UFCFIGHTER1.getRage());
    }

    @Test
    void setRage() {
        UFCFIGHTER UFCFIGHTER1 = new UFCFIGHTER("John");
        UFCFIGHTER1.setRage(50);
        Integer expected = 50;
        assertEquals(expected, UFCFIGHTER1.getRage());
    }

    @Test
    void getLow() {
        UFCFIGHTER UFCFIGHTER1 = new UFCFIGHTER("John");
        UFCFIGHTER1.setLow(15);
        Integer expected = 15;
        assertEquals(expected, UFCFIGHTER1.getLow());
    }

    @Test
    void setLow() {
        UFCFIGHTER UFCFIGHTER1 = new UFCFIGHTER("John");
        UFCFIGHTER1.setLow(15);
        Integer expected = 15;
        assertEquals(expected, UFCFIGHTER1.getLow());
    }

    @Test
    void getHigh() {
        UFCFIGHTER UFCFIGHTER1 = new UFCFIGHTER("John");
        UFCFIGHTER1.setHigh(15);
        Integer expected = 15;
        assertEquals(expected, UFCFIGHTER1.getHigh());
    }

    @Test
    void setHigh() {
        UFCFIGHTER UFCFIGHTER1 = new UFCFIGHTER("John");
        UFCFIGHTER1.setHigh(15);
        Integer expected = 15;
        assertEquals(expected, UFCFIGHTER1.getHigh());
    }

    @Test
    void changeToStr() {
        UFCFIGHTER UFCFIGHTER1 = new UFCFIGHTER("John");

        assertEquals( ("'" + UFCFIGHTER1.name + '\'' + " | Health= " +
                UFCFIGHTER1.health +
                " | Rage= " + UFCFIGHTER1.rage +
                " | Low= " + UFCFIGHTER1.low +
                " | High= " + UFCFIGHTER1.high), UFCFIGHTER1.toString());
    }

    @Test
    void getHealth() {
        UFCFIGHTER UFCFIGHTER1 = new UFCFIGHTER("John");
        Integer expected = 200;
        assertEquals(expected,UFCFIGHTER1.getHealth());
    }

    @Test
    void critAttack() {
        UFCFIGHTER attacker = new UFCFIGHTER("John");
        UFCFIGHTER defender = new UFCFIGHTER("John");
        attacker.setRage(100);
        attacker.attack(defender);
        assertTrue(defender.getHealth() < 200);
        Integer expected = 0;
        assertEquals(expected, attacker.getRage());

    }

    @Test
    void attack(){
        UFCFIGHTER attacker = new UFCFIGHTER("John");
        UFCFIGHTER defender = new UFCFIGHTER("John");
        attacker.setRage(100);
        attacker.attack(defender);
        Integer expectedRage = 0;
        assertEquals(expectedRage, attacker.rage);
        attacker.attack(defender);
        assertTrue(defender.getHealth() < 200);
        Integer expected = 15;
        assertEquals(expected, attacker.getRage());

    }

    @Test
    void heal() {
        UFCFIGHTER UFCFIGHTER1 = new UFCFIGHTER("John");
        UFCFIGHTER1.setRage(15);
        UFCFIGHTER1.setHealth(90);
        UFCFIGHTER1.heal();
        Integer expectedHealth = 100;
        assertEquals(expectedHealth, UFCFIGHTER1.getHealth());
        Integer expectedRage = 5;
        assertEquals(expectedRage, UFCFIGHTER1.getRage());
    }

    @Test
    void skip() {
        UFCFIGHTER UFCFIGHTER1 = new UFCFIGHTER("John");
        UFCFIGHTER1.skip();
        Integer expectedRage = 55;
        assertEquals(expectedRage, UFCFIGHTER1.getRage());
    }

    @Test
    void isDead() {
        UFCFIGHTER UFCFIGHTER1 = new UFCFIGHTER("John");
        UFCFIGHTER1.setHealth(0);
        assertEquals(true, UFCFIGHTER1.isDead());
        UFCFIGHTER1.setHealth(1);
        assertEquals(false, UFCFIGHTER1.isDead());
    }
}