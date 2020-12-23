public class Team
{
   private String coach;  // coach's name
   private String sport;  // name of sport
   private int wins;  // team wins
   private int losses;  // team losses
   /** Constructor that creates a team given the sport name and coaches name.
       wins and losses default to 0
       @param sport The name of the sport
       @param coach The coach's name
   */
   public Team(String sport, String coach)
   {
      this(sport,coach,0,0);
   }
   /** Constructor that creates a team given the sport name, coaches name,
       team wins and losses.
       @param sport The name of the sport
       @param coach The coach's name
       @param wins Team wins
       @param losses Team losses
   */
   public Team(String sport, String coach, int w, int l)
   {
      this.sport = sport;
      this.coach = coach;
      wins = w;
      losses = l;

   }
   
   /**
      copy constructor takes an existing Team and creates a deep
      copy of the team so it has its own set of fields.
      @ param Team an existing team
   */
   public Team(Team object2)
   {
      this(object2.sport,object2.coach,object2.wins,object2.losses);
   }
   
   
   
   
   
   
   
   /**  getWins()
        @return number of team wins
   */    
   public int getWins()
   {
      return wins;
   }
   /**  getLosses()
        @return number of team losses
   */
   public int getLosses()
   {
      return losses;
   }
   /**  addWin()
        increments number of wins
   */
   public void addWin()
   {
      wins++;
   }
   /**  addWin(num)
        @param num the number of wins to add to record
   */
   public void addWin(int num)
   {
      wins += num;
   }
   /**  addLoss()
        increments number of losses
   */
   public void addLoss()
   {
      losses++;
   }
   /**  getSport()
        @return name of sport
   */
   public String getSport()
   {
      return sport;
   }
   /**  getCoach()
        @return name of coach
   */
   public String getCoach()
   {
      return coach;
   }
   /** setCoach(String)
       @param name coach's name
   */
   public void setCoach(String name)
   {
      coach = name;
   }
   /** The toString method returns a String containing
       the team's data
       @return String containing sport name, coach name, wins and losses
   */
   public String toString()
   {
      String s = "Sport: " + sport + " " +
         "Coach: " + coach + " " +
         "Record: " + wins + " wins, " + losses + " losses";
      return s;
   }
   
   
   
   /**
      equals method returns true if the records of 
      two teams are the same.
      @ param Object a different team
      @ return are the records the same?
   */
   @ Override
   public boolean equals(Object other)
   {
      Team tOther = (Team)other;
      return this.wins == tOther.wins &&
             this.losses == tOther.losses;
   }

}