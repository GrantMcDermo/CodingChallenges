public class LargestGap{
    public static int gapFind(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest)
                largest = arr[i];
            if(arr[i] < smallest)
                smallest = arr[i];
        }
        return max - min;
    }
}