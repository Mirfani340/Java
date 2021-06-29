package com.test;

public class main {
    public static void main(String[] args) {
        //looping bersarang

        for (int i = 0; i < 9; i++ ){
            for (int j = 0; j < 9; j++){
                System.out.print("*");
                if ( j == i){
                    break;
                }
            }
            System.out.print("\n");
        }
    }
}
