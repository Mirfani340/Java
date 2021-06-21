package com.praktikum1;

import java.util.Scanner;

public class luasLingkaran {
    public static void main(String[] args) {
        // Buat objek dari library
        Scanner input = new Scanner(System.in);
        double luas, pi = 3.14;
        int jari;
        //varibel / rumus
        System.out.print("Input Jari-jari\t :");
        jari = input.nextInt();
        // perhitungan luas lingkaran
        luas = pi * jari * jari;
        System.out.println("Luas lingkaran\t =" + luas);
    }
}
