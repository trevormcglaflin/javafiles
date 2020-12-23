public class Driver
{
 public static void main(String[] args)
 {
 // create Author objects
 Author jrrTolkien = new Author("J. R. R.", "Tolkien", "hobbitman207@aol.com");
 Author brandonSanderson = new Author("Brandon", "Sanderson",
 "brandsanderson@gmail.com");
 Author brandonSanderson2 = new Author("Brandon", "Sanderson",
 "brandsanderson@gmail.com");
 // demonstrate toString( ) with Authors
 System.out.printf("Demonstrating toString with Author objects\n");
 System.out.printf("jrrTolkein: %s\n", jrrTolkien);
 System.out.printf("brandonSanderson: %s\n", brandonSanderson);
 System.out.printf("brandonSanderson2: %s\n", brandonSanderson2);

 // demonstrate == and equals
 System.out.printf("\n\nDemonstrate == and equals with Author objects\n");
 System.out.printf("jrrTolkien == brandonSanderson: %s\n",
 jrrTolkien == brandonSanderson);
 System.out.printf("brandonSanderson == brandonSanderson2: %s\n",
 brandonSanderson == brandonSanderson2);
 System.out.printf("brandonSanderson.equals(brandonSanderson2): %s\n",
 brandonSanderson.equals(brandonSanderson2));

 // create Book objects
 Book warbreaker = new Book("0765360039l", "Warbreaker", brandonSanderson,
 "Tor", 592);
 Book warbreaker2 = new Book("0765360039l", "Warbreaker", brandonSanderson,
 "Tor", 592);
 Book warbreaker3 = warbreaker2;
 Book warbreakerCopy = new Book(warbreaker);
 // demonstrate == with Book objects
 System.out.printf("\n\nDemonstrate using == operator with Book objects\n");
 System.out.printf("warbreaker == warbreaker2: %s\n",
 warbreaker == warbreaker2);
 System.out.printf("warbreaker2 == warbreaker3: %s\n",
 warbreaker2 == warbreaker3);
 System.out.printf("warbreaker == warbreaker3: %s\n", warbreaker == warbreaker3);
 System.out.printf("warbreaker2 == warbreakerCopy: %s\n",
 warbreaker2 == warbreakerCopy);

 // demonstrate equals with Book objects
 System.out.printf("\n\nDemonstrate using equals method with Book objects\n");
 System.out.printf("warbreaker.equals(warbreaker2): %s\n",
 warbreaker.equals(warbreakerCopy));
 System.out.printf("warbreaker2.equals(warbreaker3): %s\n",
 warbreaker2.equals(warbreaker3));
 System.out.printf("warbreaker.equals(warbreaker3): %s\n",
 warbreaker.equals(warbreaker3));
 System.out.printf("warbreaker2.equals(warbreakerCopy): %s\n",
 warbreaker2.equals(warbreakerCopy));
 // demonstrate copy constructor
 System.out.printf("\nDemoing Copy constructor\n");
 System.out.printf("Both objects before change\n");
 System.out.printf("warbreaker: %s\n",warbreaker);
 System.out.printf("warbreakerCopy: %s\n",warbreakerCopy);
 warbreaker.setNumPages(100);
 System.out.printf("\nBoth objects after changing warbreaker\n");
 System.out.printf("warbreaker: %s\n",warbreaker);
 System.out.printf("warbreakerCopy: %s\n",warbreakerCopy);


 }
}


 