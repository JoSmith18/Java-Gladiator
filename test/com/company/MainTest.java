package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void doAttackMove() {
        Gladiator attacker = new Fighter("Jo");
        Gladiator defender = new Fighter("Ed");
        Main.doMove(attacker,defender,"A");
        assertTrue(defender.getHealth() < 100);
    }

    @Test
    void doHealMove() {
        Gladiator attacker = new Fighter("Jo");
        Gladiator defender = new Fighter("Ed");
        attacker.setHealth(1);
        attacker.setRage(15);
        Main.doMove(attacker,defender,"H");
        assertTrue(attacker.getHealth() > 1);
    }

    @Test
    void doRageMove() {
        Gladiator attacker = new Fighter("Jo");
        Gladiator defender = new Fighter("Ed");
        Main.doMove(attacker,defender,"S");
        assertTrue(attacker.getRage() > 0);
    }

    @Test
    void findName() {
        assertEquals("Jo", Main.findName("J"));
        assertEquals("Trey", Main.findName("T"));
        assertEquals("Shedlia", Main.findName("S"));
        assertEquals("Edgar", Main.findName("E"));

    }

    @Test
    void createFighter() {
        Gladiator Fighter1 = Main.createFighter("F", "Jo");
        assertNotNull(Fighter1);
        assertNotNull(Main.createFighter("N", "Jo"));
        assertNotNull(Main.createFighter("U", "Jo"));
    }


}