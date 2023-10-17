package com.telran.org.Homework.HomeworkFohr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {
        final int cardsForPlayer = 5;
        int players;

        final Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the number of players: ");
            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (players > 0) {
                    break;
                } else {
                    System.out.println("The number of players cannot be less than 1");
                }
            } else {
                System.out.println("You have not entered a valid number!");
                sc.next(); // Clear the invalid input
            }
        }
        Deck deck = new Deck();
        deck.shuffle();

        List<Player> playerList = new ArrayList<>();
        for (int i = 1; i <= players; i++) {
            playerList.add(new Player("Player " + i));
        }

        for (Player player : playerList) {
            for (int i = 0; i < cardsForPlayer; i++) {
                Card card = deck.dealCard();
                if (card != null) {
                    player.addCardtoHand(card);
                }
            }
        }

        for (Player player : playerList) {
            System.out.println(player + " has the following cards:");
            for (Card card : player.getHand()) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}

