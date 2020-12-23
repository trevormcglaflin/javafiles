public class NodeTester
{
   public static void main(String [] args)
   {
      Node<Integer> n = new Node<>(7);
      n.setNext(new Node<Integer>(8,n.getNext()));
      n.setNext(new Node<Integer>(5, n.getNext()));
      n.setNext(new Node<Integer>(2, n.getNext()));
      
      Node<Integer> curr;
      curr = n;
      while (curr.getNext() != null)
      {
         System.out.print(curr.getItem());
         curr = curr.getNext();
      }
      System.out.println(curr.getItem());
      
      function(n, 9);
      
      curr = n;
      while (curr.getNext() != null)
      {
         System.out.print(curr.getItem());
         curr = curr.getNext();
      }
      System.out.println(curr.getItem());

      
      
      

      
      
      
      /**
      
      curr = n;
      while (curr.getNext() != null)
      {
         System.out.print(curr.getItem());
         curr = curr.getNext();
      }
      System.out.print(curr.getItem());
     */
      
      
      
      
      
   } 
   
         
      
   // Traverse list displaying data in each item
   // I supressed the output for your testing.
   public static void displayList(ListInterface<Integer> list)
	{
		for (int i = 1; i<=list.size();i++)
	   System.out.println(list.get(i));
    }
    
    /** method printList prints the contents of the collection
    of Nodes referred to be start
    @param start a reference to the first Node in the collection
  */
  public static void printList(Node<String> n)
  {
      Node<String> curr;
      curr = n;
      while (curr.getNext() != null)
      {
         System.out.print(curr.getItem());
         curr = curr.getNext();
      }
      System.out.print(curr.getItem());
   }
   
   public static Node<Integer> function(Node<Integer> start,Integer i) {
    Node<Integer> newNode = new Node<>(i,null);
    if(start == null)
        start = newNode;
    else {
        Node curr;
        for(curr = start; curr.getNext() != null ; curr = curr.getNext())
            ;
        curr.setNext(newNode);
    }
    return start;
  }

}