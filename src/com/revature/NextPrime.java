public class Main{
    public static int nextPrime(int startNumber){
        int result = 0;
        if(primeCheck(startNumber))
            result = startNumber;
        else{
            int nextNumber = startNumber;
            while(true){
                nextNumber++;
                if(primeCheck(nextNumber)){
                    result = nextNumber;
                    break;
                }
            }
        }
        return result;
    }
    static boolean primeCheck(int n){
        if(n <= 1)
            return false;
        for(int i = 2; i <= n / 2; i++){
            if((n % i) == 0)
                return false;
        }
        return true;
    }
}