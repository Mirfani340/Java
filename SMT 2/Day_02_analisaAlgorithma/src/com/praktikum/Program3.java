package com.praktikum;

public class Program3 {
    public static void main(String[] args) {
        int a [] = {4,-3,5,-2,-1,2,6,-2};
        int maxSum;
        maxSum = maxSubSum(a);
        System.out.println("Max Sum adalah \t : " + maxSum);
    }
    //Method pemanggil method maxSumRec
    public static int maxSubSum(int [] a){
        return maxSumRec(a, 0, a.length-1);
    }
    // Method utama untuk proses
    public static int maxSumRec(int []a, int left, int right){
        // intruksi pertama
        if (left == right){
            if (a[left] > 0){
                return a[left];
            }else {
                return 0;
            }
        }
        // variable center menentukan titik tengah
        int center = (left + right) / 2;
        // rekursif
        int maxLeftSum = maxSumRec(a, left, center);
        int maxRightSum = maxSumRec(a,  center+ 1, right);

        // proses menghitung bagian / batas kiri
        int maxLeftBorderSum = 0;
        int LeftBorderSum = 0;
        for (int i = center; i >= left ; i--) {
            LeftBorderSum += a[i];
            if (LeftBorderSum > maxLeftBorderSum){
                maxLeftBorderSum = LeftBorderSum;
            }
        }

        // Proses Mnghitung bagian kiri
        int maxRightBorderSum = 0;
        int rightBorderSum = 0;
        for (int i = center + 1; i <=  right ; i++) {
            rightBorderSum += a[i];
            if (rightBorderSum > maxRightBorderSum){
                maxRightBorderSum = rightBorderSum;
            }
        }

        // loop ini berfungsi untuk melihat data yang sedang di proses
        for (int i = 0; i <= right; i++) {
            System.out.print(a[ i]);
        }
        System.out.println();
        System.out.println("\nmaxLeftSum =" +maxLeftSum + "\nmaxrightSum = "
                + maxRightSum
                + "\nmaxLeftBorderSum =" + maxLeftBorderSum
                + "\nmaxRightBorderSum =" + maxRightBorderSum);

        System.out.println();
        return max(maxLeftSum, maxRightSum, maxLeftBorderSum+maxRightBorderSum);
    }
    // ini berfungsi untuk menentukan mana yang besar
    private static int max(int a, int b, int c){
        // ternary operator
        return a > b ? (a > c ? a : c) : (b > c ? b : c);
    }
}
