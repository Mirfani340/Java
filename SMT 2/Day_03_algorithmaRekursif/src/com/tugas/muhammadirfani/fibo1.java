package com.tugas.muhammadirfani;

import java.util.Scanner;

public class fibo1 {
    public static long  fibo1(long num){
        if (num == 0){
            return 0;
        }
        else if (num == 1)
            return 1;
        else {
            long x = 0;
            long y = 1;
            for (int i = 2; i <= num; i++) {
                y = x + y;
                x = y - x;
            }
            return y;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan Fibonacci ke-n :");
        long fiboInput = input.nextInt();
        long startTime = System.nanoTime();
        System.out.println("Fibonanci Ke " + fiboInput + " \tAdalah "+fibo1(fiboInput));
        long endtime = System.nanoTime();
        long timeElapsed = endtime - startTime;
        System.out.println("Time : " + timeElapsed / 1000000 + " miliseconds");
    }
}
