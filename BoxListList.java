import java.util.*;

public class BoxListList{
   
   public static ArrayList<BoxList> boxListList;
   
   public BoxListList(){
      boxListList = new ArrayList<BoxList>();
   }
      
   public  ArrayList<BoxList> getBoxListList(){
      return boxListList;
   }
   
   public static ArrayList<Box> getLastYear(){
      BoxList lastYear = boxListList.get(boxListList.size()-1);
      clearCriticalValues(lastYear);
      return lastYear.getYear();
   }

   public static void clearCriticalValues(BoxList newBox){
      for(int ii = 0; ii < newBox.getYear().size(); ii++){
         newBox.getYear().get(ii).setPaidInFull(false);
         newBox.getYear().get(ii).setAmountPaid(0.0);
         newBox.getYear().get(ii).setAreIn(false);
      }
   }
}