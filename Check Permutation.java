import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean areAnagram(String str1, String str2){
        char[] ca = str1.toCharArray();
        char[] ct = str2.toCharArray();
        Arrays.sort(ca);
        Arrays.sort(ct);
        String ss = new String(ca);
        String st = new String(ct);
        return ss.equals(st);
    }
}
