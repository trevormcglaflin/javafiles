import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class TwitterDrivers
{
   public static void main(String[] args) throws IOException
   {
         // make TwitterFeed object
         TwitterFeed tf;
         
         // open file1 and create Scanner object to read it
         File feed1 = new File("feed1.txt");
         Scanner input = new Scanner(feed1);
         
         // load contents of file1 into a twitter feed
         // use first line as screenName of feed
         tf = new TwitterFeed(input.nextLine());
         
         tf.addTweet("Trevor","Hello");
         
         while (input.hasNext() == true)
         {
            tf.addTweet(input.nextLine(),input.nextLine());
         }
         
         // close file
         input.close();
         
         
         // demonstrate twitter feed toString method
         System.out.print("TwitterFeed toString Method demontration\n"
                         + "-------------------------------------\n");
         System.out.println(tf.toString());
            
         
         
         
         // demonstrate tweetsBy method
         System.out.print("TwitterFeed tweetsBy Method (Bill Gates)\n"
                          + "---------------------------------------\n");
         ArrayList<Tweet> tweetsByBillGates = tf.tweetsBy("BillGates");
         
         for (Tweet post: tweetsByBillGates)
            System.out.println(post + "\n");
    }
}