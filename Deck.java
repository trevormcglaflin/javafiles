// Trevor McGlaflin
// March 20, 2020
// CS 110
// Deck Class

/**
   Deck class provides fields and methods for 
   creating a 52 deck of cards, shuffling those
   cards and dealing those cards
*/


import java.util.Random;

public class Deck
{
   public final static int CARDS_IN_DECK = 52;
      
   private Card [] deck; // collection of cards
   int ct;  // current count of cards in deck
    
   /** Constructs a standard 52 card deck
   */
   public Deck()
   {  
      deck = new Card[CARDS_IN_DECK];
      for (int s = Card.SPADES; s <= Card.CLUBS; s++)
         for (int r = Card.ACE; r <= Card.KING; r++)
         {
            deck[ct]=new Card(r,s);
            ct++;
         }
   }
   /* randomize the contents of the deck */
   public void shuffle()
   {  
      Random r = new Random();
      int randIndex;
      Card temp;
      for (int i=0;i<ct;i++)
      {
         randIndex = r.nextInt(ct);
         temp = deck[randIndex];
         deck[randIndex]=deck[i];
         deck[i]=temp;      
      }
   }
   /** return  top card in the deck
       update deck to no longer include the card
       @return reference to the top card  
   */
   public Card dealCard()
   {
      Card cardToReturn = deck[ct-1];
      deck[ct-1]=null; // optional
      ct--;
      return cardToReturn;
   }
   /** how many cards remain in deck
       @return current count of cards in deck
   */
   public int cardsRemaining()
   {
      return ct;
   }
   /** is the deck empty?
       @return true if deck is empty, false otherwise
   */
   public boolean isEmpty()
   {
      return ct == 0;
   }
   public String toString()
   {
      String s = "";
      for (int i = 0; i < ct; i++)
         s += deck[i] + "\n";
      return s;
   }

}