import java.util.Random;
public class ListTester
{

	public static void main(String [] args)
	{
      final int N = 20000;
	   long time1,time2, diff;
      ListInterface<Integer> list1 = new ListArrayBased<>();
      ListInterface<Integer> list2 = new ListReferenceBased<>();
      
      // get start time
      
      time1 = System.currentTimeMillis();
      
      // add to beg of arraybased
      for (int i = 1; i <= N; i++)
         list1.add(1,5);
      
      // add to end of arraybased
      //for (int i = 1; i <= N; i++)
         //list1.add(list1.size()+1,6);
         
      // remove from beginning of arraybased
      //for (int i = 1; i <= N; i++)
         //list1.remove(1);
      
      // remove from end of arraybased
      //for (int i = 1; i <= N; i++)
         //list1.remove(list1.size());
      
      // traverse from arraybased
      //for (int i = 1; i <= N; i++)
         //displayList(list1);
      
      // get end time
      time2 = System.currentTimeMillis();
      diff = time2-time1;
      System.out.println(diff);
      
      
     
      // repeat process for reference based
      
      // get start time
      time1 = System.currentTimeMillis();
      
      // add to beg of referencebased
      for (int i = 1; i <= N; i++)
         list2.add(1,5);
      
      // add to end of referencebased
      //for (int i = 1; i <= N; i++)
         //list2.add(list2.size()+1,6);
         
      // remove from beginning of referencebased
      //for (int i = 1; i <= N; i++)
         //list2.remove(1);
      
      // remove from end of referencebased
      //for (int i = 1; i <= N; i++)
         //list2.remove(list2.size());
      
      // traverse from reference based
      //for (int i = 1; i <= N; i++)
         //displayList(list2);
      
      // get end time
      time2 = System.currentTimeMillis();
      diff = time2-time1;
      System.out.print(diff);
      
     
      
      
      
      
         
      
      
      
      
      
      
      
   }
   // Traverse list displaying data in each item
   // I supressed the output for your testing.
	public static void displayList(ListInterface<Integer> list)
	{
		for (int i = 1; i<=list.size();i++)
			System.out.println(list.get(i));
         

	
	
	}
}