package com.praktikum;

import java.util.Scanner;

public class fibo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan Fibonacci ke-n :");
        int fiboInput = input.nextInt();
        System.out.println(fibo3(fiboInput));
    }
    public static long fibo3(int n){
        if (n <= 1){
           return n;
        }
        long fib1 = 0; // f(0)
        long fib2 = 1; // f(1)
        long result = 0;
        for (int i = 2; i <= n ; i++) {
            result = fib2 + fib1;
            fib1 = fib2;
            fib2 = result;
        }
        return result;
    }
}
