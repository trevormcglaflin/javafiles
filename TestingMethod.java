import java.util.ArrayList;
public class TestingMethod
{
   public static void main(String[]args)
   {
     ArrayList<Tweet> myFeed = new ArrayList<Tweet>(45);
     
     myFeed.add(new Tweet("Trevor","Hello"));
     myFeed.add(new Tweet("Jackie","Goodbye"));
     
     System.out.print(myFeed(0).getScreenName());
   }
}