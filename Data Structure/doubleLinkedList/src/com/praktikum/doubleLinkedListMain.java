package com.praktikum;
/*
Muhammad Irfani
20104037
SE04B
 */
import java.util.Scanner;

public class doubleLinkedListMain {
    private static void menu(){
        System.out.println("1.add First");
        System.out.println("2.add Last");
        System.out.println("3.show data");
        System.out.println("4.removeFirst");
        System.out.println("5.remove Last");
        System.out.println("6.insert");
        System.out.println("7.replace");
        System.out.println("8.remove");
        System.out.println("9.remove At");
        System.out.println("10.show Reversed");
        System.out.println("11.find");
        System.out.println("12.clear");
        System.out.println("13.insert After");
        System.out.println("14.insert Before");
        System.out.println("15.Data Lenght");
        System.out.println("16.Check List ");
        System.out.println("17.Exit");
    }
    public static void main(String[] args) {
        System.out.println("Assalamu 'alaikum Wr. Wb السَّلاَمُ عَلَيْكُمْ وَرَحْمَةُ اللهِ وَبَرَكَاتُهُ");
        doubleLinkedList list = new doubleLinkedList();
        Scanner scan = new Scanner(System.in);
        boolean start;
        String ask = null;
        do {
            menu();
            System.out.print("Choose :");
            int choose = scan.nextInt();
            switch (choose){
                case 1 :
                    do {
                        System.out.println("add first");
                        System.out.print("How many data ?");
                        int input = scan.nextInt();
                        for (int i = 0; i < input; i++) {
                            System.out.print("input data " + i + ":");
                            int usr = scan.nextInt();
                            Node obj = new Node(usr);
                            list.addFirst(obj);
                        }
                        list.show();
                        System.out.print("Repeat ?:");
                        ask = scan.next();
                    }while (ask.equals("yes"));
                    break;
                case 2 :
                    do {
                        System.out.println("add last");
                        System.out.print("How many data ?:");
                        int input = scan.nextInt();
                        for (int i = 0; i < input; i++) {
                            System.out.print("input data "+i+":");
                            int usr = scan.nextInt();
                            Node obj = new Node(usr);
                            list.addLast(obj);
                        }
                        list.show();
                        System.out.print("Repeat ?");
                        ask = scan.next();
                    }while (ask.equals("yes"));
                    break;
                case 3 :
                    list.show();
                    break;
                case 4 :
                        System.out.println("Remove First");
                        System.out.println("Really want to remove first ?");
                        ask = scan.next();
                        if (ask.equals("yes")){
                            list.removeFirst();
                            list.show();
                        }
                        break;
                case 5 :
                    System.out.println("Remove Last");
                    System.out.println("Really want to remove last ?");
                    ask = scan.next();
                    if (ask.equals("yes")){
                        list.removeLast();
                        list.show();
                    }
                    break;
                case 6 :
                    System.out.println("Insert");
                    do {
                        System.out.print("How many data ? :");
                        int input = scan.nextInt();
                        for (int i = 0; i < input; i++) {
                            System.out.print("Input index :");
                            int index = scan.nextInt();
                            System.out.print("Input data :"+i+":");
                            int usr = scan.nextInt();
                            Node obj = new Node(usr);
                            list.insert(index, obj);
                        }
                        list.show();
                        System.out.println("Repeat ?");
                        ask = scan.next();
                    }while (ask.equals("yes"));
                case 7 :
                    list.show();
                    System.out.println("Replace");
                    do {
                        for (int i = 0; i < 1; i++) {
                            System.out.print("Input data yang mau di ganti :");
                            int data1 = scan.nextInt();
                            System.out.println("input nilai pengandi data :");
                            int data2 = scan.nextInt();
                            Node obj1 = new Node(data1);
                            Node obj2 = new Node(data2);
                            list.replace(obj1, obj2);
                        }
                        list.show();
                        System.out.println("Repeat ?");
                        ask = scan.next();
                    }while (ask.equals("yes"));
                    break;
                case 8 :
                    System.out.println("Remove");
                    System.out.print("Input data yang mau di hapus :");
                    int dataRemove = scan.nextInt();
                    System.out.print("Really want to remove "+dataRemove + "?");
                    if (ask.equals("yes")){
                        Node objRemove = new Node(dataRemove);
                        list.remove(objRemove);
                        list.show();
                    }
                    break;
                case 9 :
                    System.out.println("Remove At (index) ");
                    do {
                        System.out.println("Masukkan index yang mau di hapus :");
                        int input = scan.nextInt();
                        list.removeAt(input);
                        list.show();
                        System.out.print("Another Remove ? :");
                        ask = scan.next();
                    }while (ask.equals("yes"));
                    break;
                case 10 :
                    System.out.println("Show Reversed");
                    list.showReversed();
                    System.out.println("Unreversed Data");
                    list.show();
                    break;
                case 11 :
                    System.out.println("Find data");
                    do {
                        System.out.print("Input data :");
                        int input = scan.nextInt();
                        Node obj = new Node(input);
                        list.find(obj);
                        System.out.print("Find again ? :");
                        ask = scan.next();
                    }while (ask.equals("yes"));
                    break;
                case 12 :
                    System.out.println("Clear All data !!!");
                    System.out.print("Really want to clear ? ");
                    ask = scan.next();
                    if (ask.equals("yes")){
                        list.clear();
                    }
                    break;
                case 13 :
                    do {
                        System.out.println("Insert After");
                        for (int i = 0; i < 1; i++) {
                            System.out.print("Insert Index Key :");
                            int key = scan.nextInt();
                            Node obj2 = new Node(key);
                            System.out.print("Input data :");
                            int input = scan.nextInt();
                            Node obj1 = new Node(input);
                            list.insertAfter(obj1,obj2);
                        }
                        list.show();
                        System.out.println("Repeat ?");
                        ask = scan.next();
                    }while (ask.equals("yes"));
                    break;
                case 14 :

                    break;
                case 15 :
                    System.out.println("Show data lenght");
                    list.length();
                    break;
                case 16 :
                    System.out.println("Check list data");
                    if (list.isEmpty()){
                        System.out.println("Data Empty !");
                    }else {
                        System.out.println("Data is");
                        list.show();
                    }
                    break;
                case 17 :
                    System.out.println("وَ السَّلاَمُ عَلَيْكُمْ وَرَحْمَةُ اللهِ وَبَرَكَاتُهُ");
                    return;
            }
        }while (start = true);

    }
}
