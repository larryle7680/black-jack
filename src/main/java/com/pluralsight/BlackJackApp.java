package com.pluralsight;
import java.util.ArrayList;
import java.util.Scanner;

public class BlackJackApp {
    static Scanner theScanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Create 2 String ArrayList to hold their names and card info
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();

        //Prompt users for their names and store it
        System.out.println("=== Black Jack ===");
        System.out.println();
        System.out.print("Player 1 Name: ");
        String name1 = theScanner.nextLine();
        System.out.println();
        System.out.print("Player 2 Name: ");
        String name2 = theScanner.nextLine();
        System.out.println();

        //Creating a deck
        Deck deck = new Deck();

        //Create the 2 hands
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();


        //Shuffle the deck
        deck.shuffle();

        //use a for loop to distribute the cards
        for(int i = 0; i < 2; i++){
            //Grabbing a card from the deck because it has the stored value
            //Assigning it to the card object
            Card card = deck.deal();
            //Now we have a card, not assign it to the hand
            hand1.deal(card);
            hand2.deal(card);
        }


    }
}
