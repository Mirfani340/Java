package com.irfanApplication;

import java.util.Random;

public class Program1_Modified {
    public static int maxSubSUm(int [] a){
        int maxSum = 0; // untuk menampung nilai maximal
        for (int i = 0; i < a.length; i++) {
            System.out.println("Outer Loop");
            for (int j = i; j < a.length; j++) {
                System.out.println("Inner Loop 1");
                // variable untuk menampung nilai sementara
                int thisSum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.println("Inner loop 2");
                    thisSum += a[k];// masuk ke indexs 0 array
                    System.out.println("Di tambah ");
                    System.out.println("This Sum\t :" + thisSum);
                }
                if (thisSum > maxSum){
                    maxSum = thisSum;
                    System.out.println("Max sum \t: " +maxSum);
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int a [] = new int[1000];
        Random rand = new Random();
        // Module untuk generate random number
        for (int i = 0; i < a.length; i++) {
            a [i] = rand.nextInt(1000)+1;
        }
        int maxSum;
        maxSum = maxSubSUm(a);
        System.out.println("Max Sum adalah \t: " + maxSum);
    }
}
