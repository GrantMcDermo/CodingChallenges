public class SecondMax{
    public static void secondMaximum(int n, in[][] nArray){
        for(int[] array : nArray){
            for(int i = 0; i < 2; i++){
                for(int j = 0; j < 2 - 1; j++){
                    if(array[j] > array[j + 1]){
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            System.out.print(array[1]);
        }
    }
}