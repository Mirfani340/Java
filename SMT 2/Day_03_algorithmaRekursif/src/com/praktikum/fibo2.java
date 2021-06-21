package com.praktikum;

import java.util.Scanner;

public class fibo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan Fibonacci ke-n :");
        int fiboInput = input.nextInt();
        System.out.println(fibo2(fiboInput));
    }
    /*
    Misal kan f(3)
    fibo2(2 + 1)
    ==> f(3) = f(2) + f(1)
     */
    public static long fibo2(int n){
        if (n <= 1){ // basic case
            return n;
        }else {
            return fibo2(n-1) + fibo2(n-2);// rekursif
        }
    }
}
