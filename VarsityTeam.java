public class VarsityTeam extends Team
{
   private double funding;
   private int numScholarships;
   
   public VarsityTeam(String sport, String coach, double funding, int numScholarships)
   {
      super(sport,coach);
      this.funding = funding;
      this.numScholarships = numScholarships;
   }
   
   public void setFunding(double funding)
   {
      this.funding = funding;
   }
   
   public int getNumScholarships()
   {
      return numScholarships;
   }
}
   