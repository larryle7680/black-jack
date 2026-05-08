package com.pluralsight;
import java.util.Scanner;

public class BlackJackApp {
    static Scanner theScanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Prompt users for their names and store it
        System.out.println("=== Black Jack ===");
        System.out.println();
        System.out.print("Player 1 Name: ");
        String hand1 = theScanner.nextLine();
        System.out.println();
        System.out.print("Player 2 Name: ");
        String hand2 = theScanner.nextLine();
        System.out.println();

        //Creating a deck
        Deck deck = new Deck();

        //Shuffle the deck
        deck.shuffle();


    }
}
