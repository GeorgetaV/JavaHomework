package org.example;


import java.util.Arrays;

import static org.example.Constans.*;

public  class Lottery {
    public static void main(String[] args) {


        Player[] players = new Player[NUMBER_OF_PLAYERS];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player();
        }
        LuckyNumbers.createLuckyNumbers();
        System.out.println("---------------------------------------------------");
        System.out.println("Today's lucky numbers are: " + Arrays.toString(LuckyNumbers.luckyNumbers));
        System.out.println("--------------------------------------------------");


        for (Player player : players) {
            player.compareNumbers();
            System.out.println("Player with the name " + player.playerName + ":");
            System.out.println("Your numbers are: " + Arrays.toString(player.playerNumbers));
            System.out.println("You guessed:  " + player.winsCount + " numbers.\n");
        }
    }
}