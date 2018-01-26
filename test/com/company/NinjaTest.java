package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NinjaTest {
    @Test
    void getName() {
        Ninja Ninja1 = new Ninja("John");
        Ninja1.setName("John");
        assertEquals("John", Ninja1.getName());
    }

    @Test
    void setName() {
        Ninja Ninja1 = new Ninja("John");
        Ninja1.setName("John");
        assertEquals("John", Ninja1.name);
    }

    @Test
    void setHealth() {
        Ninja Ninja1 = new Ninja("John");
        Ninja1.setHealth(10);
        Integer expected = 10;
        assertEquals(expected, Ninja1.health);


    }

    @Test
    void healthCannotBeSetAbove200(){

        Ninja Ninja = new Ninja("John");
        Ninja.setHealth(205);
        Integer expected = 200;
        assertEquals(expected, Ninja.health);
    }

    @Test
    void getRage() {
        Ninja Ninja1 = new Ninja("John");
        Integer expected = 15;
        assertEquals(expected, Ninja1.getRage());
        assertEquals(Ninja1.rage, Ninja1.getRage());
    }

    @Test
    void setRage() {
        Ninja Ninja1 = new Ninja("John");
        Ninja1.setRage(50);
        Integer expected = 50;
        assertEquals(expected, Ninja1.getRage());
    }

    @Test
    void getLow() {
        Ninja Ninja1 = new Ninja("John");
        Ninja1.setLow(15);
        Integer expected = 15;
        assertEquals(expected, Ninja1.getLow());
    }

    @Test
    void setLow() {
        Ninja Ninja1 = new Ninja("John");
        Ninja1.setLow(15);
        Integer expected = 15;
        assertEquals(expected, Ninja1.getLow());
    }

    @Test
    void getHigh() {
        Ninja Ninja1 = new Ninja("John");
        Ninja1.setHigh(15);
        Integer expected = 15;
        assertEquals(expected, Ninja1.getHigh());
    }

    @Test
    void setHigh() {
        Ninja Ninja1 = new Ninja("John");
        Ninja1.setHigh(15);
        Integer expected = 15;
        assertEquals(expected, Ninja1.getHigh());
    }

    @Test
    void changeToStr() {
        Ninja Ninja1 = new Ninja("John");

        assertEquals( ("'" + Ninja1.name + '\'' + " | Health= " +
                Ninja1.health +
                " | Rage= " + Ninja1.rage +
                " | Low= " + Ninja1.low +
                " | High= " + Ninja1.high), Ninja1.toString());
    }

    @Test
    void getHealth() {
        Ninja Ninja1 = new Ninja("John");
        Integer expected = 200;
        assertEquals(expected,Ninja1.getHealth());
    }

    @Test
    void critAttack() {
        Ninja attacker = new Ninja("John");
        Ninja defender = new Ninja("John");
        attacker.setRage(100);
        attacker.attack(defender);
        assertTrue(defender.getHealth() < 200);
        Integer expected = 0;
        assertEquals(expected, attacker.getRage());

    }

    @Test
    void attack(){
        Ninja attacker = new Ninja("John");
        Ninja defender = new Ninja("John");
        attacker.setRage(100);
        attacker.attack(defender);
        assertTrue(defender.getHealth() < 200);
        Integer expected = 0;
        assertEquals(expected, attacker.getRage());

    }

    @Test
    void heal() {
        Ninja Ninja1 = new Ninja("John");
        Ninja1.setRage(15);
        Ninja1.setHealth(90);
        Ninja1.heal();
        Integer expectedHealth = 105;
        assertEquals(expectedHealth, Ninja1.getHealth());
        Integer expectedRage = 5;
        assertEquals(expectedRage, Ninja1.getRage());
    }

    @Test
    void skip() {
        Ninja Ninja1 = new Ninja("John");
        Ninja1.skip();
        Integer expectedRage = 30;
        assertEquals(expectedRage, Ninja1.getRage());
    }

    @Test
    void isDead() {
        Ninja Ninja1 = new Ninja("John");
        Ninja1.setHealth(0);
        assertEquals(true, Ninja1.isDead());
        Ninja1.setHealth(1);
        assertEquals(false, Ninja1.isDead());
    }
}