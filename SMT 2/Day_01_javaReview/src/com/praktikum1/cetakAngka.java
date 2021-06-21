package com.praktikum1;

public class cetakAngka {
    public static void main(String[] args) {
        //deklarasi variabel
        int a, b;
        // outer loop
        //Looping decrement
        for (a = 7; a >= 0; a--){
            //inner loop
                for (b = 7; b >= a; b--){
                System.out.print(b + "");
            }
            System.out.println();
        }
    }
}
