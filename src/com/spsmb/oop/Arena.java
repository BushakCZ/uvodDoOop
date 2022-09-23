package com.spsmb.oop;

import java.util.Scanner;

public class Arena {

    private Scanner sc = new Scanner(System.in);
    private String name;

    public Arena(String name) {
        this.name = name;
    }

    public void fight(ArenaPlayer playerOne, ArenaPlayer playerTwo) {
        System.out.println("V arene " + name + " proti sobe bojuji:");
        System.out.println(playerOne);
        System.out.println(playerTwo);
        round(playerOne, playerTwo);
    }

    private void round(ArenaPlayer playerOne, ArenaPlayer playerTwo) {
        System.out.println("Zacina kolo: ");
        System.out.println("Hrac " + playerOne.getName() + " je na rade");
        String playerOneInput = userInput();
        userAction(playerOneInput, playerOne, playerTwo);
        System.out.println("Hrac " + playerTwo.getName() + " je na rade");
        String playerTwoInput = userInput();
        userAction(playerTwoInput, playerTwo, playerOne);
        round(playerOne, playerTwo);
    }

    private String userInput() {
        System.out.println("Dostupne akce: ");
        System.out.println("utok");
        System.out.println("vzdat se");
        return sc.nextLine();
    }

    private void userAction(String action, ArenaPlayer attackingPlayer, ArenaPlayer defendingPlayer) {
        switch (action) {
            case "utok" -> {
                attack(attackingPlayer, defendingPlayer);
            }
            case "vzdat se" -> {
                System.out.println("Hrac " + attackingPlayer.getName() + " se vzdal");
                System.out.println("Hrac " + defendingPlayer.getName() + " vyhrava");
                System.exit(1);
            }
            default -> {
                System.out.println("Zadana akce je nedostupna");
                String input = userInput();
                userAction(input, attackingPlayer, defendingPlayer);
            }
        }
    }

    private void attack(ArenaPlayer attackingPlayer, ArenaPlayer defendingPlayer) {
        defendingPlayer.setHp(defendingPlayer.getHp() - attackingPlayer.getDmg());
        if (defendingPlayer.getHp() <= 0) {
            System.out.println("Hrac " + defendingPlayer + " umrel");
            System.out.println("Hrac " + attackingPlayer + " vyhral");
            System.exit(1);
        } else {
            System.out.println(attackingPlayer);
            System.out.println(defendingPlayer);
        }
    }
}
