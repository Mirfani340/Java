package com.test;

import java.util.Scanner;

public class fibo2 {
    public static long fibo2(long n){
        if (n <= 1){ // basic case
            return n;
        }else {
            return fibo2(n-1) + fibo2(n-2);// rekursif
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan Fibonacci ke-n :");
        long fiboInput = input.nextLong();
        long startTime = System.nanoTime();
        System.out.println("Fibonanci Ke " + fiboInput + " \tAdalah "+fibo2(fiboInput));
        long endtime = System.nanoTime();
        long timeElapsed = endtime - startTime;
        System.out.print("Membutuhkan waktu :" + timeElapsed / 10000000 + " milisecond");
        // Konversi wakto nanosecond ke milisecond
    }
    /*
    Misal kan f(3)
    fibo2(2 + 1)
    ==> f(3) = f(2) + f(1)
     */
}
