import java.util.ArrayList;
public class ShipDriver
{
   public static void main(String[] args)
   {
      ArrayList<Ship> ships = new ArrayList<Ship>();
      ships.add(new CargoShip("Trevor's Cruise Ship",2019, 200));
      ships.add(new CruiseShip("Trevor's Cargo Ship",2015, 500));
      
      for (Ship s : ships)
      {
         System.out.println(s.toString());
      }
    }
}