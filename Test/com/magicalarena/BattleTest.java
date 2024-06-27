package com.magicalarena;

import static org.junit.Assert.*;
import org.junit.Test;

public class BattleTest {
    @Test
    public void testBattle() {
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);
        Battle battle = new Battle(playerA, playerB);
        battle.fight();
        assertTrue(playerA.getHealth() <= 0 || playerB.getHealth() <= 0);
    }
}
