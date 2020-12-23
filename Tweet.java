// Trevor McGlaflin
// February 24, 2020
// CS 110
// Assignment 6


/**
   this class contains fields and methods
   for creating, and displaying Tweets.
*/
public class Tweet
{
      // declare instance variables
      private String screenName;
      private String tweetContent;
      
     
     
      // declare public class constant
      public final int MAX_CHARS = 140;
      
      
      
      
      /**
         Tweet constructor assigns name and content
         to a tweet, and limits 140 characters to any
         tweet.
         @ param screenName the name of tweeter
         @ param tweetContent the content in the tweet
     */
     public Tweet(String name, String content)
     {
         screenName = name;
         
         // if statement that trims content if it exceed MAX_CHARS
         String slicedContent;
         if (content.length() < MAX_CHARS)
            tweetContent = content;
         else
         {
            slicedContent = content.substring(0,MAX_CHARS);
            tweetContent = slicedContent;
         }
      }
      
      /**
         Copy constructor that takes an existing Tweet and 
         copy's it to a new reference.
         @ param object an existing Tweet object
      */
      public Tweet(Tweet object)
      {
         this(object.screenName,object.tweetContent);
      }
      
      
      
      
      
      
      /**
         to String return the screen name of the tweet
         preceeded by @ and the content of the tweet in 
         quotes.
         @ return a string representation of a Tweet
      */
      public String toString()
      {
         String tweetString = "@" + screenName + "\n"
                            + "\"" + tweetContent + "\"";
         return tweetString;
      }
      
      
      
      
      
      // the following 2 methods are accessors which
      // return the instance variables
      
      /**
         getScreenName will return the screen name.
         @ return the name of the tweeter
      */
      public String getScreenName()
      {
         return screenName;
      }
      
      /*
         getTweetContent will return the content of 
         the tweet.
         @ return the content of the tweet
      */
      public String getTweetContent()
      {
         return tweetContent;
      }
      
      
      
      
      
      
      // the following two methods are mutators which
      // assign values to the instance variables
      
      /**
         setScreenName sets the screen name to a string
         value.
         @ param screenName the name of the tweeter
      */
      public void setScreenName(String name)
      {
         screenName = name;
      }
      
      /**
         setTweetContent sets the content to the first 140
         characters of the string parameter.
         @ param content uncut tweet
      */
      public void setTweetContent(String content)
      {
            // if statement that trims content if it exceed MAX_CHARS
            String slicedContent;
            if (content.length() < MAX_CHARS)
               tweetContent = content;
            else
            {
               slicedContent = content.substring(0,MAX_CHARS);
               tweetContent = slicedContent;
            }
       }
       
       
       
       /**
         equals method checks if both the screenName and content
         of a Tweet are the same and returns a boolean value.
         @ param other a seperate tweet 
         @ return 
      */
      public boolean equals(Object other)
      {
         Tweet tOther = (Tweet)other;
         return this.screenName == tOther.screenName &&
                this.tweetContent == tOther.tweetContent;
      }
}
            