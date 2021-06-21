package com.tugas;
/*
Muhammad Irfani
20104037
SE04B
 */
import java.util.*;
public class decimalToBiner {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();

        System.out.println("Masukan Bilangan Desimal : ");
        int decimal = in.nextInt();
        int num = decimal;
        while (num != 0)
        {
            int d = num % 2;
            stack.push(d);
            num /= 2;
        }

        System.out.print("\nBiner dari "+decimal+" adalah : ");
        while (!(stack.isEmpty() ))
        {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}
