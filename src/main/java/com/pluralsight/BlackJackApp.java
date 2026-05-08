package com.pluralsight;

public class BlackJackApp {
    public static void main(String[] args) {
     //Create a deck
        Deck deck = new Deck();

        //Create the players
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();

        //Deal 2 cards to each player
        for(int i = 0; i <= 1; i++){
            //Shuffle the deck
            deck.shuffle();
            //Grab a card from the deck to hand1
            Card card1 = deck.deal();
            //Now add it to hand1
            hand1.deal(card1);
            //Grab a card from the deck to hand2
            Card card2 = deck.deal();
            //Now add it to hand2
            hand2.deal(card2);

            System.out.println("Hand 1 Cards: " + card1.getPointValue());
            System.out.println("Hand 2 Cards : " + card2.getPointValue());

        }
    }
}
