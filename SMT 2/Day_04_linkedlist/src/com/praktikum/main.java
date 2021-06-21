package com.praktikum;
/*
Muhammad Irfani
20104037
SE04B
 */
import java.util.Scanner;

public class main {
    public static void menu(){
        System.out.println("Chose Menu");
        System.out.println("1. add First");
        System.out.println("2. add Last");
        System.out.println("3. Insert After");
        System.out.println("4. insert Before");
        System.out.println("5. insert");
        System.out.println("6. Replace");
        System.out.println("7. Remove");
        System.out.println("8. remove First");
        System.out.println("9. remove Last");
        System.out.println("10. Find data");
        System.out.println("11. Data Lenght");
        System.out.println("12. Remove at");
        System.out.println("13. Clear All Data");
        System.out.println("14. Exit");
    }
    public static void main(String[] args) {
        System.out.println("السَّلاَمُ عَلَيْكُمْ وَرَحْمَةُ اللهِ وَبَرَكَاتُهُ");
        Scanner scan = new Scanner(System.in);
        LinkList link = new LinkList();
        String repeat = null;
        boolean found = false;
        do {
            menu();
            link.printNode();
            System.out.print("Chose : ");
            int usrChoose = scan.nextInt();
            switch (usrChoose){
                case 1 :
                    do {
                        System.out.print("How many data ? :");
                        int manyData = scan.nextInt();
                        System.out.println("add First");
                        for (int i = 0; i < manyData; i++) {
                            Node obj = new Node();
                            System.out.print("Masukkan data " + i +":");
                            int input = scan.nextInt();
                            obj.data = input;
                            link.addFirst(obj);
                        }
                        System.out.print("Input again ?: ");
                        repeat = scan.next();
                    }while (repeat.equals("yes"));
                    link.printNode();
                    break;

                case 2 :
                    do {
                        System.out.print("How many data ? :");
                        int manyData = scan.nextInt();
                        System.out.println("add Last");
                        for (int i = 0; i < manyData; i++) {
                            Node obj = new Node();
                            System.out.print("Masukkan data " + i + ":");
                            int input = scan.nextInt();
                            obj.data = input;
                            link.addLast(obj);
                        }
                        System.out.print("Input again ? :");
                        repeat = scan.next();
                    }while (repeat.equals("yes"));
                    link.printNode();
                    break;

                case 3 :
                    do {
                        System.out.println("How many data ? :" );
                        int manyData = scan.nextInt();
                        for (int i = 0; i < manyData; i++) {
                            Node obj = new Node();
                            System.out.println("\nInsert after");
                            System.out.print("Masukkan key : ");
                            int key = scan.nextInt();
                            System.out.print("Masukkan data : ");
                            int input = scan.nextInt();
                            obj.data = input;
                            link.insertAfter(key, obj);
                        }
                        System.out.print("Input again ? :");
                        repeat = scan.next();
                    }while (repeat.equals("yes"));
                    link.printNode();
                    break;

                case 4 :
                    do {
                        System.out.println("How many ? :");
                        int manyData = scan.nextInt();
                        for (int i = 0; i < manyData; i++) {
                            Node obj = new Node();
                            System.out.println("\nInsert before");
                            System.out.print("Masukkan key : ");
                            int key = scan.nextInt();
                            System.out.print("Masukkan data : ");
                            int input = scan.nextInt();
                            obj.data = input;
                            link.insertBefore(key, obj);
                        }
                        System.out.print("Input again ? :");
                        repeat = scan.next();
                    }while (repeat.equals("yes"));
                    link.printNode();
                    break;

                case 5 :
                    do {
                        System.out.println("Insert berdasarkan index");
                        System.out.println("How many data ? :");
                        int manyData = scan.nextInt();
                        for (int i = 0; i < manyData; i++) {
                            Node obj = new Node();
                            System.out.println("\nInsert");
                            System.out.print("Masukkan index : ");
                            int index = scan.nextInt();
                            System.out.print("Masukkan data : ");
                            int input = scan.nextInt();
                            obj.data = input;
                            link.insert(index, obj);
                        }
                        System.out.print("Input again ? :");
                        repeat = scan.next();
                    }while (repeat.equals("yes"));
                    link.printNode();
                    break;

                case 6 :
                    do {
                        System.out.println("Replace data");
                        System.out.println("\nReplace data");
                        System.out.print("Input data yang ingin diganti : ");
                        int data1 = scan.nextInt();
                        System.out.print("Input data baru : ");
                        int data2 = scan.nextInt();
                        link.replace(data1, data2);
                        System.out.print("Replace again ? :");
                        repeat = scan.next();
                    }while (repeat.equals("yes"));
                    link.printNode();
                    break;

                case 7 :
                    do {
                        System.out.println("\nRemove data");
                        System.out.print("Input data yang akan dihapus : ");
                        int hapus = scan.nextInt();
                        link.remove(hapus);
                        System.out.print("Input again ? :");
                        repeat = scan.next();
                    }while (repeat.equals("yes"));
                    link.printNode();
                    break;

                case 8 :
                    do {
                        System.out.println("\nRemove data awal");
                        link.removeFirst();
                        System.out.print("Remove data awal again ? :");
                        repeat = scan.next();
                    }while (repeat.equals("yes"));
                    link.printNode();
                    break;

                case 9 :
                    do {
                        System.out.println("\nRemove data akhir");
                        link.removeLast();
                        System.out.print("Remove data ankir again ? :");
                        repeat = scan.next();
                    }while (repeat.equals("yes"));
                    break;

                case 10 :
                    do {
                        System.out.println("\nMencari data");
                        System.out.print("Masukkan data yang dicari : ");
                        int cari = scan.nextInt();
                        link.find(cari);
                        System.out.print("Find again ? :");
                        repeat = scan.next();
                    }while (repeat.equals("yes"));
                    link.printNode();
                    break;

                case 11 :
                    System.out.println();
                    link.length();
                    break;

                case 12 :
                    System.out.println("Delete data berdasarkan index");
                    System.out.print("Input index yang mau di hapus :");
                    int cari = scan.nextInt();
                    link.removeAt(cari);
                    link.printNode();
                    break;
                case 13 :
                    System.out.print("Are you sure want to delete all data  yes / no?");
                    repeat = scan.next();
                    if (repeat.equals("yes")){
                        link.clear();
                    }
                    link.printNode();
                    break;

                case 14 :
                    System.out.println("وَ السَّلاَمُ عَلَيْكُمْ وَرَحْمَةُ اللهِ وَبَرَكَاتُهُ");
                    return;
            }
        }while (found == false);
    }
}