// Trevor McGlaflin
// January 15, 2019
// CS 110
// Assignment #1

/*
This program is designed to calculate how many grosses of eggs, dozens of eggs (beyond gross count), 
and individual eggs(beyond dozen count) were sold this month based on given input. 
*/


import java.util.Scanner;     // import Scanner

public class Eggs             // create Eggs class
{
   public static void main(String[] args)    // create main method
   {
      System.out.println("Jackie's Egg Layers");                           // display title
      int numberOfEggs;                                                    // declare numberOfEggs variable as an integer
      Scanner keyboard = new Scanner(System.in);                           // declare and initialize keyboard variable which attaches Scanner and System.in objects
      System.out.print("How many eggs did you sell this month? ");         // prompt user for input
      numberOfEggs = keyboard.nextInt();                                   // store input in numberOfEggs variable
      int gross,dozens,individualEggs,leftOver;                            // declare gross, dozens, individualEggs and leftOver variables as integers
      gross = numberOfEggs/144;                                            // calculate gross
      System.out.println("You sold "+gross+" gross of eggs");              // display gross
      leftOver = numberOfEggs%144;                                         // calculate remainding eggs
      dozens = leftOver/12;                                                // calculate dozens remaining
      System.out.println("You sold "+dozens+" dozens of eggs");            // display dozens
      individualEggs = leftOver%12;                                        // calcualte remaining individual eggs
      System.out.println("You sold "+individualEggs+" individual eggs");   // display individual eggs amount
    }                                                                      
}
      

