import java.util.*;

public class Box{
   
   public static int totalCost; 
   private ArrayList<String> names;
   private ArrayList<String> emails; 
   private String address;
   private int phone;//no symbols (1234567891 format not 123-456-7891)
   private boolean areIn;
   private boolean paidInFull;
   private double amountPaid;//US dollars
   private int datePaid;//In MMDDYYYY format
   private String pickUpLocation;
   private String comments;
   
   public Box(ArrayList<String> names, ArrayList<String> emails, String address, int phone, boolean areIn, boolean paidInFull, double amountPaid, int datePaid, String pickUpLocation, String comments){
      this.names = names;
      this.emails = emails;
      this.address = address;
      this.phone = phone;
      this.areIn = areIn;
      this.paidInFull = paidInFull;
      this.amountPaid = amountPaid;
      this.datePaid = datePaid;
      this.pickUpLocation = pickUpLocation;
      this.comments = comments;
   }
   
   public void setNames(ArrayList<String> names){
      this.names = names;
   }
   public ArrayList<String> getNames(){
      return names;
   }
   public void setEmails(ArrayList<String> emails){
      this.emails = emails;
   }
   public ArrayList<String> getEmails(){
      return emails;
   }
   public void setAddress(String address){
      this.address = address;
   }
   public String getAddress(){
      return address;
   }
   public void setPhone(int phone){
      this.phone = phone;
   }
   public int getPhone(){
      return phone;
   }
   public void setAreIn(boolean areIn){
      this.areIn = areIn;
   }
   public boolean getAreIn(){
      return areIn;
   }
   public void setPaidInFull(boolean paidInFull){
      this.paidInFull = paidInFull;
   }
   public boolean getPaidInFull(){
      return paidInFull;
   }
   public void setAmountPaid(double amountPaid){
      this.amountPaid = amountPaid;
   }
   public double getAmountPaid(){
      return amountPaid;
   }
   public void setDatePaid(int datePaid){
      this.datePaid = datePaid;
   }
   public int getDatePaid(){
      return datePaid;
   }
   public void setPickUpLocation(String pickUpLocation){
      this.pickUpLocation = pickUpLocation;
   }
   public String getPickUpLocation(){
      return pickUpLocation;
   }
   public void setComments(String comments){
      this.comments = comments;
   }
   public String getComments(){
      return comments;
   }
   
}