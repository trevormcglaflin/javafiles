import java.util.Scanner;
import java.util.Scanner;
public class Temperature
{
    private double ftemp;
    public Temperature(double f)
    {
        ftemp = f;
    }
    public void setFahrenheit(double f)
    {
        ftemp = f;
    }
    public double getFahrenheit()
    {
        return ftemp;
    }
    public double getCelsius()
    {
        double celsius = (5/9.0) * (ftemp-32.0);
        return celsius;
    }
    public double getKelvin()
    {
        double kelvin = ((5/9.0)*(ftemp-32.0))+273;
        return kelvin;
    }
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit temperature: ");
        double f = input.nextDouble();
        
        Temperature find = new Temperature(f);
        double fahrenheit = find.getFahrenheit();
        double celsius = find.getCelsius();
        double kelvin = find.getKelvin();
        System.out.printf("The temperature in Fahrenheit is %.1f\n",fahrenheit);
        System.out.printf("The temperature in Celsius is %.15f\n",celsius);
        System.out.printf("The temperature in Kelvin is %.13f\n",kelvin);
        
        
        
    }
    
}
