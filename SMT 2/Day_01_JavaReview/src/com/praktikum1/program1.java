package com.praktikum1;

//Cetak bintang
public class program1 {
    public static void main(String[] args) {
        //Outer loop berulang sebanyak 5 kali
        for (int i = 1; i <= 5; i++) {
            //Inner loop mengulang sebanyak kurang dari samadengan i
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");//pakai print = cetak di sebelahnya
            }
            System.out.println();// Ini artinnya ganti baris
        }
    }
}
