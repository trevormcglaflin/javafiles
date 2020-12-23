public class ExamRecursion
{
   public static void main(String []args)
  {
      int n = 7;
      System.out.print(sumNums(8));
   
  }
 
 public static int sumNums(int n)
 {
   if (n == 0)
      return 0;
   else
      return n + sumNums(n-1);
 }
}