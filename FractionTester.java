public class FractionTester
{
   public static void main(String[]args)
   {
      Fraction f = new Fraction(1,2);
      Fraction f2 = new Fraction(1,3);
      Fraction result = add(f,f2);
      System.out.printf("%d / %d\n",f3.getNumerator(),f3.getDenominator());
   }
      
      
      
      
      
   }
   public static Fraction add(Fraction f, Fraction f2)
   {
      int numerator1 = f.getNumerator();
      int denominator1 = f.getDenominator();
      int numerator2 = f2.getNumerator();
      int denominator2 = f2.getDenominator();
      
      int numeratorNew = (numerator1 * denominator2)+(numerator2*denominator1);
      int denominatorNew = denominator1 * denominator2;
      
      Fraction f3 = new Fraction(numeratorNew,denominatorNew);
      return f3;
    }
      
}
   