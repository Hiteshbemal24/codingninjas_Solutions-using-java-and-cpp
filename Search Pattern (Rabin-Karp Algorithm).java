import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List< Integer > stringMatch(String text, String pattern){
         List<Integer> count=new ArrayList<>();       

         for(int i=0;i<=text.length()-pattern.length();i++){
           if(text.substring(i,i+pattern.length()).equals(pattern)){       

              count.add(i+1);      

          }            

    }                      

      return count;   
    }
}
