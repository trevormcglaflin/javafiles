import java.io.*;
import java.util.Scanner;
public class FileTesting
{
   public static void main(String[] args)
   {
      double pv = 10000;
      double air = 3.5;
      int years = 3;
      double fv = futureValue(pv,air,years);
      System.out.print(fv);
   }
   
   public static double futureValue(double pv, double air, int years)
   {
      double fv = pv * Math.pow((1+(air/12/100)),years*12);
      return fv;
   }
}  
         
      
   
     
 
