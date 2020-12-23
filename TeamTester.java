public class TeamTester
{
   public static void main(String[]args)
   {
      Team t1 = new Team("Basketball","Trevor",4,6);
      Team t2 = new Team(t1);
      Team t3 = t1;
      
      System.out.println(t2);
      System.out.print(t3);
      
   }
}