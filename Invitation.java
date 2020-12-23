public class Invitation
{
   private String invitee;
   private String event;
   private String date;
   private Address address;
   private Address addressOfInvitee;
   private boolean attending;
   
   
   /*
      constructor assigns all instance variables
      to their respectable parameters.
      @ param String invitee
      @ param String event
      @ param String date
      @ param Address address
      @ param Address addressOfInvitee
      @ param boolean attending
   */
   public Invitation(String i, String e, String d, Address a, Address aInv, boolean att)
   {
      invitee = i;
      event = e;
      date = d;
      address = a;
      addressOfInvitee = aInv;
      attending = att;
   }
   
   /*
      constructor assigns all instance variables
      to their respectable parameters, except attending,
      which it assigns to false.
      @ param String invitee
      @ param String event
      @ param String date
      @ param Address address
      @ param Address addressOfInvitee
   */
   public Invitation(String i, String e, String d, Address a, Address aInv)
   {
      this(i,e,d,a,aInv,false);
   }
   
   /*
      getInvitee
      @ return String invitee
   */
   public String getInvitee()
   {
      return invitee;
   }
   
   /*
      getEvent
      @ return String event
   */
   public String getEvent()
   {
      return event;
   }
   
   /*
      getDate
      @ return String date
   */
   public String getDate()
   {
      return date;
   }
   
   /*
      getAddress
      @ return Address adress
   */
   public Address getAddress()
   {
      return address;
   }
   
   /*
      getAddressOfInvitee
      @ return Adress address of invitee
   */
   public Address getAddressOfInvitee()
   {
      return addressOfInvitee;
   }
   
   /*
      getAttending
      @ return boolean attending
   */
   public boolean getAttending()
   {
      return attending;
   }
   
   
   /*
      method turns attending variable to true.
   */
   public void positiveResponse()
   {
      attending = true;
   }
      
    
    
    
}   
   

