import java.util.ArrayList;
public class Solution
{
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
       int start = 0, end = arr.size()-2;
        while(start<=end) {
            int mid = (start+end) >> 1;
            if(arr.get(mid) == arr.get(mid^1)) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return arr.get(start);
    }
}
