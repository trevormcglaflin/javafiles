public class Car
{
    private int yearModel;
    private String make;
    private int speed;
    
    public Car(int year, String carMake)
    {
        yearModel = year;
        make = carMake;
    }
    public int getYearModel()
    {
        return yearModel;
    }
    public String getMake()
    {
        return make;
    }
    public int getSpeed()
    {
        return speed;
    }
    public void accelerate()
    {
        speed += 5;
    }
    public void brake()
    {
        speed -= 5;
    }
    public static void main(String[]args)
    {
        Car myCar = new Car(2018,"Toyota");
        for (int count = 0;count<5;count++)
        {
            myCar.accelerate();
            System.out.println(myCar.getSpeed());
        }
        for (int count = 0;count<5;count++)
        {
            myCar.brake();
            System.out.println(myCar.getSpeed());
        }
        
    }
}
     