// Trevor McGlaflin
// February 29, 2020
// CS 110
// TwitterFeed Class

// import necessary classes
import java.util.ArrayList;


/**
   this class contains fields and methods
   for creating, changing and displaying
   a twitter feed.
*/
public class TwitterFeed
{
   // declare instance variables
   private String screenName;
   private ArrayList<Tweet> feed;
   
   // declare private class constant
   private final int INITIAL_CAPACITY = 100;
   
   
   
   /**
      constructor assigns screen name and creates
      and initializes the ArrayList feed to store 
      100 blank elements.
      @ param screenName username of twitter feed
   */
   public TwitterFeed(String name)
   {
      screenName = "@" + name;
      
      feed = new ArrayList<Tweet>(INITIAL_CAPACITY);
   }
   
   
   
   
   // the next two methods are accessor methods
   // which return the instance variables
   
   /**
      getScreenName returns the screen name.
      @ return username of twitter feed
   */
   public String getScreenName()
   {
      return screenName;
   }
   
   
   /**
      getFeed  returns a deep copy of the feed.
      @ return feed an arraylist containing tweets in feed
   */
   public ArrayList<Tweet> getFeed()
   {
         // create an ArrayList that will hold feed's copied content
         ArrayList<Tweet> feedCopy = new ArrayList<Tweet>(INITIAL_CAPACITY);
         
         // use enhanced for loop to make deep copy of feed
         for(Tweet post:feed)
         {
            feedCopy.add(post);
         }
         
         // return copy of feed
         return feedCopy;
    }
    
    
    
    
    // the next two addTweet methods are used to add new and
    // existing tweets to the feed 
    
    /**
      addTweet takes a screenName and content and makes
      a Tweet object that is added to feed.
      @ param screenName username of twitter feed
      @ param content content of a tweet
    */
    public void addTweet(String name, String content)
    {
         // create a Tweet object with given parameters
         Tweet tweet = new Tweet(name,content);
         
         // add Tweet object to feed
         feed.add(tweet);
    }
    
    /**
      addTweet takes an existing Tweet object and adds it
      to feed.
      @ param tweet an existing tweet object
    */
    public void addTweet(Tweet tweet)
    {
         feed.add(tweet);
    }
    
    
    
    
    
    
    /**
      toString method returns a String containing 
      the owner of the feed,and all the tweets in the feed.
      @ return string representation of twitter feed
   */
   public String toString()
   {
      String feedString = screenName + "\n\n";
      for (Tweet tweet: feed)
      {
         feedString += tweet.toString();
         feedString += "\n\n";
      }
      return feedString;
   }
   
   
   
   /**
      tweetsBy method takes a string and returns an ArrayList
      of tweets by that username.
      @ param userName a username
      @ return an arraylist with all tweets by given username
   */
   public ArrayList<Tweet> tweetsBy(String userName)
   {
         // create new ArrayList
         ArrayList<Tweet> feedBy = new ArrayList<Tweet>();
         
         // create loops that adds all tweets in feed
         // to new arraylist by specified username
         for(Tweet tweet: feed)
         {
            
            
            if (tweet.getScreenName().equals(userName))
               feedBy.add(tweet);
         }
         
         // return new array
         return feedBy;
    }
}