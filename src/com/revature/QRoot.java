package com.revature;

public class QRoot {
    public static int quadratic(int a, int b, int c){
        if(a == 0){
            System.out.println("Invalid input");
            return -1;
        }
        int temp = Math.pow(b, 2) - (4 * a * c);
        int square = Math.sqrt(abs(temp));
        return Math.ceil((-b + square) / (2 * a));
    }
}