package com.praktikum;

import java.util.Scanner;

public class test {
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
        System.out.println("12. Remove at WIP");
        System.out.println("13. Clear WIP");


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkList link = new LinkList();
        menu();
        System.out.println("Chose :");
        int usrChoose = scan.nextInt();
        switch (usrChoose){
            case 1 :

        }

        if (link.isEmpty()){
            System.out.println("List kosong!");
        }

        // coba addFirst
        System.out.println("add First");
        for (int i = 0; i < 3; i++) {
            Node obj = new Node();
            System.out.print("Masukkan data " + i +":");
            int input = scan.nextInt();
            obj.data = input;
            link.addFirst(obj);
        } link.printNode();

        // coba addLast
        System.out.println("add Last");
        for (int i = 0; i < 3; i++) {
            Node obj = new Node();
            System.out.print("Masukkan data " + i + ":");
            int input = scan.nextInt();
            obj.data = input;
            link.addLast(obj);
        } link.printNode();

        // coba insertAfter
        for (int i = 0; i < 1; i++) {
            Node obj = new Node();
            System.out.println("\nInsert after");
            System.out.print("Masukkan key : ");
            int key = scan.nextInt();
            System.out.print("Masukkan data : ");
            int input = scan.nextInt();
            obj.data = input;
            link.insertAfter(key, obj);
        } link.printNode();

        // coba insertBefore
        for (int i = 0; i < 1; i++) {
            Node obj = new Node();
            System.out.println("\nInsert before");
            System.out.print("Masukkan key : ");
            int key = scan.nextInt();
            System.out.print("Masukkan data : ");
            int input = scan.nextInt();
            obj.data = input;
            link.insertBefore(key, obj);
        } link.printNode();

        // coba insert berdasarkan index
        System.out.println("Insert berdasarkan index");
        for (int i = 0; i < 1; i++) {
            Node obj = new Node();
            System.out.println("\nInsert");
            System.out.print("Masukkan index : ");
            int index = scan.nextInt();
            System.out.print("Masukkan data : ");
            int input = scan.nextInt();
            obj.data = input;
            link.insert(index, obj);
        } link.printNode();

        // coba replace
        System.out.println("Replace data");
        System.out.println("\nReplace data");
        System.out.print("Input data yang ingin diganti : ");
        int data1 = scan.nextInt();
        System.out.print("Input data baru : ");
        int data2 = scan.nextInt();
        link.replace(data1, data2);
        link.printNode();

        // coba remove data
        System.out.println("\nRemove data");
        System.out.print("Input data yang akan dihapus : ");
        int hapus = scan.nextInt();
        link.remove(hapus);
        link.printNode();

        // coba removeFirst
        System.out.println("\nRemove data awal");
        link.removeFirst();
        link.printNode();

        // coba removeLast
        System.out.println("\nRemove data akhir");
        link.removeLast();
        link.printNode();

        // coba find
        System.out.println("\nMencari data");
        System.out.print("Masukkan data yang dicari : ");
        int cari = scan.nextInt();
        link.find(cari);

        // length
        System.out.println();
        link.length();
    }
}