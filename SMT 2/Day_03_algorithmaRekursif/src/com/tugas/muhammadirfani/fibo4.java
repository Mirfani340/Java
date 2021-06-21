package com.tugas.muhammadirfani;
import java.util.Scanner;

public class fibo4 {
    public static void main(String[] args) {
        //FIBONACCI
        Scanner input = new Scanner(System.in);
        //REKURSIF
        System.out.print("Input bilangan :");
        int bilangan = input.nextInt();
        System.out.print("Masukkan Pangkat :");
        int pangkat = input.nextInt();
        long startTime = System.nanoTime();
        System.out.println("Bilangan\t" +bilangan+"\tPangkat\t" +pangkat + "\t=\t" +rekursif(bilangan, pangkat));
        long endTime = System.nanoTime();
        long elapasedTime = endTime - startTime;
        System.out.println("Time : " + elapasedTime / 1000000 +" milisecond");
    }
    // Fibonaci
    public static long fibo4(int n){
        return fiboHelp(0,1,n);
    }
    /*
    x = f(0) = 0
    y = f(1) = 1
    n = f(n)
     */

    public static long fiboHelp(long x, long y,int n){
        if (n == 0){
            return x;
        }else if (n == 1){
            return y;
        }else {
            return fiboHelp(y, x+y, n-1);
        }
    }
    // Menghitung bilangan pangkat
    public static int rekursif(int pangkat, int bilangan){
        if (pangkat == 0){
            return 1;
        }else {
            return bilangan*rekursif(pangkat-1, bilangan);
        }
    }
}
