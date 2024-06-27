package com.magicalarena;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest {
    @Test
    public void testPlayerInitialization() {
        Player player = new Player("TestPlayer", 100, 10, 5);
        assertEquals("TestPlayer", player.toString());
        assertEquals(100, player.getHealth());
        assertEquals(10, player.getStrength());
        assertEquals(5, player.getAttack());
    }

    @Test
    public void testPlayerRollDie() {
        Player player = new Player("TestPlayer", 100, 10, 5);
        int dieRoll = player.rollDie();
        assertTrue(dieRoll >= 1 && dieRoll <= 6);
    }

    @Test
    public void testPlayerIsAlive() {
        Player player = new Player("TestPlayer", 100, 10, 5);
        assertTrue(player.isAlive());
        player.setHealth(0);
        assertFalse(player.isAlive());
    }
}
