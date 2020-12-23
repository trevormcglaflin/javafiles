public class Factorial
{
   private static int printArray(int[] array) 
   {
      
      if (array.length == 0)
         System.out.println();
      else
         for (int i : array)
         {
            System.out.print(i + " ");
         }
         System.out.println();
         int[] array2 = new int[array.length-1];
         int count;
         for (count = 0; count < array.length-1;count++)
         {
            array2[count] = array[count];
         }
         return printArray(array2);
   }
   
   public static void main(String[]args) throws NegativeArraySizeException
   

   {
      int[] array = {0,5,6,7};
      System.out.print(printArray(array));
   }
}