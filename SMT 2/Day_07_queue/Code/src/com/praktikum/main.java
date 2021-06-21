/*
Muhammad Irfani
20104037
SE04B
 */
package com.praktikum;
import java.util.Scanner;
public class main {
    static void menu(){
        System.out.println("( Assalamu 'alaikum Wr. Wb ) السَّلاَمُ عَلَيْكُمْ وَرَحْمَةُ اللهِ وَبَرَكَاتُهُ");
        System.out.println("Pilih Option");
        System.out.println("1 Enqueue Data");
        System.out.println("2 Dequeue Data");
        System.out.println("3 Remove all data");
        System.out.println("4 Show data");
        System.out.println("5 Exit");

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        QueueClass Queue = new QueueClass();
        boolean end = false;
        do {
            if (Queue.isEmpty()){
                System.out.println("Maaf belum ada data !!");
            } else {
                System.out.print("");
                Queue.show();
                System.out.println();
            }
            menu();
            System.out.print("Choose :");
            int choose = scan.nextInt();
            switch (choose){
                case 1 :
                    System.out.print("How many data ? :");
                    int usrInput = scan.nextInt();
                    for (int i = 0; i < usrInput; i++) {
                        System.out.print("Inputkan data : ");
                        int input = scan.nextInt();
                        Node data = new Node(input);
                        Queue.enqueue(data);
                    }
                    System.out.println();
                    break;
                case 2 :
                    Queue.dequeue();
                    System.out.println();
                    break;
                case 3 :
                    System.out.print("Are you sure ? : ");
                    String usrString = scan.next();
                    if (usrString.equals("yes")){
                        Queue.makeEmpty();
                    }
                    System.out.println();
                    break;
                case 4 :
                    Queue.show();
                    System.out.println();
                    break;
                case 5 :
                    System.out.println("( Wa 'alaikum salam Wr. Wb ) وَعَلَيْكُمْ السَّلاَمُ وَرَحْمَةُ اللهِ وَبَرَكَاتُهُ ");
                    System.out.println();
                    return;
            }
        }while (end == false);
    }
}
