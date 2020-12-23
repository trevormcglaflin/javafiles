// Trevor McGlaflin
// March 20, 2020
// CS 110
// CardDriver class

/**
   this driver class uses the Card and Deck methods
   to create two 5 card hands. It has methods that allow
   for cards to be sorted in ascending order and displayed.
*/

public class CardDriver
{
   /**
      displayCard method takes an array of 
      cards and displays them
      @ param Card[] an array of cards
   */
   public static void displayCards(Card[] cards)
   {
      for (int count = 0; count < cards.length; count++)
      {
         System.out.println(cards[count].toString());
      }
    }
    
    
    /**
      selectionSort method takes an array of cards and
      places them in ascending order based on rank
      and suit.
      @ param Card[] an array of cards
   */
    public static void selectionSort(Card[] array)
    {
      int startScan, index, minIndex;
      Card minValue;
      for (startScan = 0; startScan < (array.length-1); startScan++)
      {
         minIndex = startScan;
         minValue = array[startScan];
         for(index = startScan+1; index < array.length; index++)
         {
            if (array[index].compareTo(minValue) < 0)
            {
               minValue = array[index];
               minIndex = index;
            }
         }
         array[minIndex] = array[startScan];
         array[startScan] = minValue;
        }
      }
    
    
    /** 
      main method creates an array of Card objects displays
      them, sorts them, then displays them again in order.
    */
    public static void main(String[]args)
    {
         // create deck of 52 cards
         Deck deck = new Deck();
         
         // shuffle deck
         deck.shuffle();
         
         
         // create two hands of 5
         Card[] hand1 = new Card[5];
         Card[] hand2 = new Card[5];
         
         // deal cards into hand1 from the deck
         for (int count = 0; count < hand1.length; count ++)
         {
            hand1[count] = deck.dealCard();
         }
         
         // deal cards into hand2 from the deck
         for (int count = 0; count < hand2.length; count ++)
         {
            hand2[count] = deck.dealCard();
         }
         
         // display header
         System.out.println("***Deck Created***");
         System.out.println("***Shuffling.....***");
         System.out.println("***Cards Dealt***\n");
         
         
         // display cards unsorted
         System.out.println("Player 1 hand: ");
         displayCards(hand1);
         System.out.println();
         System.out.println("Player 2 hand: ");
         displayCards(hand2);
         System.out.println();
         
         // sort each hand
         selectionSort(hand1);
         selectionSort(hand2);
         System.out.println("***Cards Sorted***");
         
         // display cards sorted
         System.out.println("Player 1 hand: ");
         displayCards(hand1);
         System.out.println();
         System.out.println("Player 2 hand: ");
         displayCards(hand2);
         System.out.println();
         
      }
    
  
}