package com.irfanApplication;

import java.util.Arrays;

public class arrRandomInt {
    public static void main(String[] args) {
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*1000);
        }
        System.out.println("generated \n" + Arrays.toString(array));
    }
}
