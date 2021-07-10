package com.test;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        doubly list = new doubly();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("contoh addFirst");
            System.out.print("Inputkan data : ");
            int input = scanner.nextInt();
            Node obj = new Node(input);
            list.addFirst(obj);
        }list.show();

        for (int i = 0; i < 3; i++) {
            System.out.println("contoh addLast");
            System.out.print("Inputkan data : ");
            int input = scanner.nextInt();
            Node obj = new Node(input);
            list.addLast(obj);
        }list.show();

        System.out.println("contoh removeFirst");
        list.removeFirst();
        list.show();
        System.out.println("contoh removeLast");
        list.removeLast();
        list.show();

        System.out.println("contoh insert");
        for (int i = 0; i < 1; i++) {
            System.out.println("inputkan index : ");
            int index = scanner.nextInt();
            System.out.println("inputkan datanya : ");
            int input = scanner.nextInt();
            Node obj = new Node(input);
            list.insert(index, obj);
        }list.show();

        System.out.println("contoh replace");
        for (int i = 0; i < 1; i++) {
            System.out.print("Inputkan data yang ingin diganti :");
            int data1 = scanner.nextInt();
            System.out.print("Inputkan data baru : ");
            int data2 = scanner.nextInt();
            Node obj1 = new Node(data1);
            Node obj2 = new Node(data2);
            list.replace(obj1, obj2);
        }list.show();

        System.out.println("contoh remove");
        System.out.print("Inputkan data yang ingin dihapus : ");
        int remove = scanner.nextInt();
        Node objremove = new Node(remove);
        list.remove(objremove);
        list.show();

        System.out.println("contoh removeAt");
        System.out.print("Inputkan index data yang ingin dihapus : ");
        int removeindex = scanner.nextInt();
        list.removeAt(removeindex);
        list.show();

        System.out.println("contoh showReversed");
        list.showReversed();

        System.out.println("contoh find");
        System.out.print("cari data : ");
        int cari  = scanner.nextInt();
        Node objcari = new Node(cari);
        list.find(objcari);

        list.length();
        list.clear();
        list.isEmpty();
    }
}
