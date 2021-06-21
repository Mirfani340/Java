package com.tugas;

public class tugas {
    public static void main(String[] args) {
        int x, y, angka=1, baris=4;
        for (x = 0; x < baris; x++){
            for (y = 0; y <= x; y++){
                if (angka > 9){
                    System.out.println("0");
                    break;
                }
                System.out.print(angka + " ");
                angka++;
            }
            System.out.println();
        }
    }
}
