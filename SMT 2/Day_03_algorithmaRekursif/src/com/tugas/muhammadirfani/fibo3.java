package com.tugas.muhammadirfani;

import java.util.Scanner;

public class fibo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan Fibonacci ke-n :");
        int fiboInput = input.nextInt();
        long startTime = System.nanoTime();
        System.out.println("Fibonanci Ke " + fiboInput + " \tAdalah "+fibo3(fiboInput));
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Time : " + timeElapsed / 1000000 + " milisecond");
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
