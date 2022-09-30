import java.util.Arrays;

public class LargeGap{
    public static int largestGap(int[] nums){
        Arrays.sort(nums);
        int result = 0;
        for(int i = 0; i < nums.length - 1; i++)
            result = Math.max(nums[i + 1] - nums[i], result);
        return result;
    }
}