package com.praktikum;

public class Program2 {
    public static int maxSubSum(int [] a){
        int maxSum = 0;
        for (int i = 0; i < a.length; i++) {
            // untuk thisSum dideklarasi di outer loop
            System.out.println("Outer Loop");
            int  thisSum = 0;
            for (int j = i; j < a.length; j++) {
                System.out.println("Inner loop 1");
                // Proses di tambahkan secara berurutan
                // masuk inner loop
                //mencari lebih besar mana
                thisSum += a[j];
                System.out.println("This sum saat ini \t :" + thisSum);
                if (thisSum > maxSum){
                    maxSum = thisSum;

                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int a [] = {4, -3, 5, -2, -1, 2, 6, -2};
        int maxSum;
        maxSum = maxSubSum(a);
        System.out.println("Max Sum adalah \t : " + maxSum);
    }
}
