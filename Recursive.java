import java.util.Arrays;
public class Recursive
{
   public static int addArray(int[] array)
   {
      if (array.length == 0)
         return 0;
      else
      {
         int[] array2 = Arrays.copyOfRange(array,1,array.length);
         return array[0] + addArray(array2);
      }
   }
   
   public static 
   
   public static void main(String[]args)
   {
      int[] array = {1,2,3};
      System.out.print(addArray(array));
      System.out.print(multiplyArray(array));
   }
         
}
