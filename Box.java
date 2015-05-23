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
   public String getNames(){//returns a string of names seperated by commas, not an ArrayList
      String listOfNames = names.get(0);
      if(names.size() > 1){ 
         for (int ii = 1; ii < names.size(); ii++){
            listOfNames += ", " + names.get(ii);
         }
      }
      return listOfNames;
   }
   public void setEmails(ArrayList<String> emails){
      this.emails = emails;
   }
   public String getEmails(){//returns a string of emails seperated by commas, not an ArrayList
      String listOfEmails = emails.get(0);
      if(emails.size() > 1){
         for (int ii = 1; ii < emails.size(); ii++){
            listOfEmails += ", " + emails.get(ii);
         }
      }
      
      return listOfEmails;
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