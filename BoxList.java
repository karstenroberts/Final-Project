import java.util.*;
import java.io.*;

public class BoxList{
   
   private ArrayList<Box> year;
   private String yearName;
   
   public BoxList(String yearName, boolean copyLast){
      if(copyLast){ 
         this.year = BoxListList.getLastYear();
         this.yearName = yearName;
      }
      else{
         this.yearName = yearName;
         this.year = new ArrayList<Box>();
      }
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
   
   public String allEmails(){
      String emails = "";
      for(int ii = 0; ii < year.size(); ii++){
         emails += year.get(ii).getEmails();
      }
      return emails;
   }
   public String emailForLocation(String location){
      String emails = "";
      for (int ii = 0; ii < year.size(); ii++){
         if(year.get(ii).getPickUpLocation().equals(location)){
            emails += year.get(ii).getEmails();
         }
      }
      return emails;
   }
   
   public String peopleIn(){
      String names = "";
      for (int ii = 0; ii < year.size(); ii++){
         if (year.get(ii).getAreIn()){
            names += year.get(ii).getNames() + "; ";
         }
      }
      return names;
   }
   
   public void finalList(String fileName){
      File outputFile = new File(fileName);
      PrintStream output = null;
      boolean fileFound = false;
      while(!fileFound){
         try{
            output = new PrintStream(outputFile);
            fileFound = true;
         }
         catch (FileNotFoundException e){
            fileFound = false;
         }  
      }
      ArrayList<String> locationSearches = new ArrayList<String>();
      ArrayList<Box> sortedBoxes = new ArrayList<Box>();
      locationSearches.add(year.get(0).getPickUpLocation());
      for(int jj = 0; jj < year.size(); jj++){
         for(int ii = 0; ii < year.size(); ii++){
            if(year.get(ii).getPickUpLocation().equals(locationSearches.get(locationSearches.size()-1))){
               sortedBoxes.add(year.get(ii));
            }
         }
         if(locationSearches.get(locationSearches.size()-1) != year.get(jj).getPickUpLocation()){
            locationSearches.add(year.get(jj).getPickUpLocation());
         }
      }
      for(int kk = 0; kk < sortedBoxes.size(); kk++){
         output.printf("%-15s", sortedBoxes.get(kk).getPickUpLocation(), "%-15s", sortedBoxes.get(kk).getNames(), "%-15s", sortedBoxes.get(kk).getPhone());
      }
   }
}