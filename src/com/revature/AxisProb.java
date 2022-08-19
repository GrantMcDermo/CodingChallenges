import java.util.Scanner;

public class AxisProb{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int n = sc.nextInt();
            System.out.println(axis(n));
        }
        sc.close();
    }
    public static long axis(int n){
        return (long) (n + 1) * (n + 2) / 2 - 1;
    }
}