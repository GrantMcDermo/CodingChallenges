import java.util.*;
public class MedianProb{
    public static double med(int[] nums1, int[] nums2){
        HashSet<Integer> allNums = new HashSet<Integer>();
        for(int i = 0; i < nums1.length; i++){
            allNums.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            allNums.add(nums2[i]);
        }
        List<Integer> numsList = new ArrayList<Integer>(allNums);
        Collections.sort(numsList);
        if(numsList.size() % 2 == 1){
            return numsList.get((numsList.size() + 1) / 2 - 1);
        } else{
            double lower = (double) numsList.get(numsList.size() / 2 - 1);
            double higher = (double) numsList.get(numsList.size() / 2);

            return (lower + higher) / 2.0;
        }
    }
}