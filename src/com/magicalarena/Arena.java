package com.magicalarena;

public class Arena {
    public static void main(String[] args) {
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);

        Battle battle = new Battle(playerA, playerB);
        battle.fight();
    }
}
