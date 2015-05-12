import java.util.*;
public class BoxList{
   
   private ArrayList<Box> year;
   private String yearName;
   
   public BoxList(String yearName){
      this.yearName = yearName;
      this.year = new ArrayList<Box>();
   }
   
   public void setYear(ArrayList<Box> year){
      this.year = year;
   }
   public ArrayList<Box> getYear(){
      return year;
   }
   public void setYearName(String yearName){
      this.yearName = yearName;
   }
   public String getYearName(){
      return yearName;
   }
}