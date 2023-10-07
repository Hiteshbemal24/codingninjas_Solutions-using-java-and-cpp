import java.util.List;
import java.util.ArrayList;
public class Solution {
    public static List<List<String>> partition(String str) {
        List<List<String>> res = new ArrayList<>();
        partition(str.toCharArray(),res,0,new ArrayList<String>());
        return res;
    }

    private static void partition(char[] str,List<List<String>> res,int idx,ArrayList<String> list){
        if(idx==str.length)
           res.add(new ArrayList<String>(list));
        
        for(int i=idx;i<str.length;i++){
            if(isPalindrome(str,idx,i)){
                list.add(String.valueOf(str,idx,i-idx+1)); 
                partition(str,res,i+1,list);
                list.remove(list.size()-1);
            }
        }
    }
    private static boolean isPalindrome(char[] str,int i,int j){
        while(i<j){
            if(str[i++]!=str[j--])
            return false;
        }
        return true;
    }
}
