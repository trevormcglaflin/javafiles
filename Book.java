// Trevor McGlaflin
// February 13, 2020
// CS 110
// Book Class

/*
   Book class provides various methods for storing, altering,
   and displaying information about books. 
*/

public class Book
{
      // declare instance variables
      private String isbn;
      private String title;
      private String publisher;
      private Author author;
      private int pgNum;
      
      
      /*
         Book constructor takes 5 parameters including isbn,
         title, author, publisher and page numbers respectively.
         It stores these parameters in their instance variables.
         @ param String Isbn
         @ param String Title
         @ param Author Author
         @ param String Publisher
         @ param int Number of pages
      */
      public Book(String i, String t, Author a, String p, int pgs)
      {
         isbn = i;
         title = t;
         author = a;
         publisher = p;
         pgNum = pgs;
      }
      
      
      
      /*
         this alternate Book constructor takes a reference
         to a Book object as a parameter and makes
         a copy of that instance. 
      */
      public Book(Book object2)
      {
         isbn = object2.isbn;
         title = object2.title;
         publisher = object2.publisher;
         author = object2.author;
         pgNum = object2.pgNum;
      }
      
      
      
      
      
      // The following 5 methods are accessor methods which return
      // instance variables in their existing data type. 
      
      /*
         getIsbn will return the isbn value.
         @ return String isbn
      */
      public String getIsbn()
      {
         return isbn;
      }
      
      
      /*
         getTitle will return the title value.
         @ return String title
      */
      public String getTitle()
      {
         return title;
      }
      
      /*
         getAuthor will return the instance
         of the author class.
         @ return Author author
      */
      public Author getAuthor()
      {
         return author;
      }
      
      /*
         getPublisher will return the publisher.
         @ return String publisher
      */
      public String getPublisher()
      {
         return publisher;
      }
      
      
      /*
         getNumberOfPages returns the number of pages
         in book.
         @ return int number of pages
      */
      public int getNumberOfPages()
      {
         return pgNum;
      }
      
      
      
      
      
      // The next 5 methods are mutator methods that will
      // change the value of an instance variable to the
      // given parameter.
      
      
      /*
         setIsbn sets the isbn variable to given parameter.
         @ param String isbn
      */
      public void setIsbn(String i)
      {
         isbn = i;
      }
      
      
      /*
         setTitle sets the title to given parameter.
         @ param String title
     */
     public void setTitle(String t)
     {
        title = t; 
     } 
     
     
     /*
         setAuthor sets author to given parameter.
         @ param Author author
     */
     public void setAuthor(Author a)
     {
         author = a;
     }
     
    
     /*
         setPublisher sets publisher to given parameter
         @ param String publisher
     */
     public void setPublisher(String p)
     {
         publisher = p;
     }
     
     
     /*
         setNumPages sets number of pages to given parameter.
         @ param int number of pages
     */
     public void setNumPages(int n)
     {
         pgNum = n;
     }
     
    
    
    
    
    
    
    /*
         toString method returns a string displaying all instance
         variables inside of a book instance.
         @ return String
     */
     public String toString()
     {
         String b = title + ", "
                  
                  + author.getFirstName() + " " + author.getLastName() 
                  + " <" + author.getEmail() + "> "
                  + "(" + "ISBN-10 #" + isbn + ", "
                  +  pgNum + " pages)";
         return b;
      }
      
      
      
      
      
      
      /*
         equals method takes an Object parameter and converts it to
         Book. Then it returns a boolean value depending on if author,
         title, and isbn are the equal. 
         @ param Object Object2
      */
      public boolean equals(Object object2)
      {
            Book book2 = (Book)object2;
            
            return this.title == book2.title &&
                   this.isbn == book2.isbn &&
                   this.author.equals(book2.author);
      }
         
}
      
      
      
   
   