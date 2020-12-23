import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class TwitterDriverss
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
         
         
         
         // demonstrate tweetsBy method
         ArrayList<Tweet> tweetsByBillGates = tf.tweetsBy("BillGates");
         
         
         System.out.print(tweetsByBillGates);
         
      
     
    }
}
      
      