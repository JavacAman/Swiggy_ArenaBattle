package com.magicalarena;

public class Battle {
    private Player player1;
    private Player player2;

    public Battle(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void fight() {
        Player attacker = player1.getHealth() < player2.getHealth() ? player1 : player2;
        Player defender = attacker == player1 ? player2 : player1;

        while (attacker.isAlive() && defender.isAlive()) {
            int attackRoll = attacker.rollDie();
            int defenseRoll = defender.rollDie();

            int damage = (attacker.getAttack() * attackRoll) - (defender.getStrength() * defenseRoll);
            damage = Math.max(damage, 0); // Ensure damage is not negative
            if (damage > 0) {
                defender.setHealth(defender.getHealth() - damage);
            }

            System.out.println(attacker + " attacks " + defender + " for " + damage + " damage.");
            System.out.println(defender + " has " + defender.getHealth() + " health left.");

            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        Player winner = attacker.isAlive() ? attacker : defender;
        System.out.println(winner + " wins the battle!");
    }
}
