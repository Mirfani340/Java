package com.praktikum;

public class Program4 {
    public static int maxSubSum(int [] a){
        int maxSum = 0;
        int thisSum = 0;
        for (int i = 0; i < a.length; i++) {
            thisSum += a[i];
            System.out.println("ThisSum Sekarang :" +thisSum);
            if (thisSum > maxSum){
                maxSum = thisSum;
                System.out.println("maxSum sekarang :" +maxSum);
            }else if (thisSum < 0){
                thisSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int a [] = {4,-3,5,-2,-1,2,6,-2};
        int maxSum;
        maxSum = maxSubSum(a);
        System.out.println("Max Sum adalah \t : " + maxSum);
    }
}
