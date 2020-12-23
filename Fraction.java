public class Fraction
{
   // instance variables
   private int numerator;
   private int denominator;
   
   // constructors
   public Fraction(int num, int den)
   {
      numerator = num;
      denominator = den;
   }
   public Fraction(int num)
   {
      numerator = num;
      denominator = 1;
   }

   /** method setNumerator takes a value
       to set the Fraction's numerator to
       @param n the numerator value
   */
   public void setNumerator(int n)
   {
      numerator = n;
      reduce();
   }   
   /** method setDenominator takes a value
       to set the Fraction's denoninator to
       if d == 0, denominator is set to 1
       @param d the denoninator value
   */
   public void setDenominator(int d)
   {
      if (d == 0)
         denominator = 1;
      else
         denominator = d;
      reduce();
   }   
   /** method getNumerator will return Fraction's
       numerator
       @return Fraction's numerator
   */
   public int getNumerator()
   {
      return numerator;
   }
   /** method getDenominator will return Fraction's
       denominator
       @return Fraction's denominator
   */
   public int getDenominator()
   {
      return denominator;
   }
   /** method getDecimal will return Fraction's
       decimal equivalent
       @return Fraction's decimal value
   */
   public double getDecimal()
   {
      return (double)numerator/denominator;
   }
   /** method reduce will reduce the fraction to its lowest term.
       the method will also ensure the denominator is never negative.
   */
   private void reduce()
   {
      if (denominator < 0)
      {
         numerator = -numerator;
         denominator = -denominator;
      }
      int gcd = 1;
      int i = Math.min(Math.abs(numerator),Math.abs(denominator));
      while (gcd == 1 && i > 0)
      {
         if (numerator % i == 0 && denominator % i == 0)
            gcd = i;
         i--;
      }
      numerator /= gcd;
      denominator /= gcd;
   }
}
