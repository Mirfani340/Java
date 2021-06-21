package com.praktikum;

import java.util.Scanner;
/*
default Void is public
Muhammad Irfani
20104037
SE04B
 */
public class Node {

    //    Deklarasi Atribut
    Object data;// data
    Node next;// pointer
    Node tos;// Top Of Stack A K A HEAD
    //    Construktor tanpa parameter
    public Node(){}
    //    construcktor
    public Node(Object a){
        this.data = a;
    }

    public boolean isEmpty(){
        return (tos == null);
    }
//    Menambahkan element
    public void push(Node input){
        if (isEmpty()){
            tos = input; // Nilai tos jadi nilai input
        }else { // Stack isi
            input.next = tos; // Pointer next di isi nilai tos
            tos = input; // Pposisi tos diisikan dengan nolai yang di inputkan
        }
    }
//    Mengambil data pada urutan terakhir
    public void pop(){
        if (!isEmpty()){
            Node temp = tos;// temp menyimpan data sementara
            tos = tos.next; // Pointer next
            temp.next = null;
            System.out.println("yang di pop :"+temp.data.toString());//toString buat ambil data int jadi String
        }else {
            System.out.println("Stack is empty !!!");
        }
    }
//    Menampilkan isi stacj
    public void show(){
        if (!isEmpty()){
            Node temp = tos;
            while (temp != null){
                System.out.println(temp.data.toString()+"\n");
                temp = temp.next;
            }
        }else {
            System.out.println("Stack Empty !!!");
        }
    }
//    Method nilai dari pop
    void top(){
        Node temp = tos;
        System.out.println("TOP sekarang :" + temp.data);
    }
//    Method untuk mengecek nilai top dan pop
    void topAndPop(){
        this.top(); // memanggil method top
        this.pop(); // memenaggil method pop
    }
//    Mehtod untuk mengosongkan data di dalam stack
    void makeEmpty(){
        tos = null;
        System.out.println("Data deleted !!!");
    }

    static void menu(){
        System.out.println("السَّلاَمُ عَلَيْكُمْ وَرَحْمَةُ اللهِ وَبَرَكَاتُهُ ( Assalamu 'alaikum Wr. Wb )");
        System.out.println("1. push data");
        System.out.println("2. POP data");
        System.out.println("3. Show data");
        System.out.println("4. Clear data");
        System.out.println("5. Show TOP data");
        System.out.println("6. TOP and POP data");
        System.out.println("7. Exit");
    }
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        boolean end = false;
        Node obj1 = new Node();
        do {
            menu();
            System.out.print("Choose : ");
            int choose = scan.nextInt();
            switch (choose){
                case 1 :
                    System.out.print("How many input ? :");
                    int usr = scan.nextInt();
                    for (int i = 0; i < usr; i++) {
                        System.out.print("Input Int\s" + i + ":");
                        int num = scan.nextInt();
                        Node obj2 = new Node(num);
                        obj1.push(obj2);
                    }
                    System.out.println();
                    break;
                case 2 :
                    obj1.pop();
                    System.out.println();
                    obj1.show();
                    break;
                case 3 :
                    obj1.show();
                    System.out.println();
                    break;
                case 4 :
                    System.out.println("Are you sure want to delete all ??");
                    String usrString = scan.next();
                    if (usrString.equals("yes")){
                     obj1.makeEmpty();
                    }else {
                        System.out.println("Cancelled by user");
                        System.out.println("Have a nice day !!!");
                    }
                    System.out.println();
                    break;
                case 5 :
                    obj1.top();
                    System.out.println();
                    break;
                case 6 :
                    obj1.topAndPop();
                    System.out.println();
                    break;
                    /*
                case 7 :
                    System.out.println("Decimal to biner");
                    System.out.print("input Decimal :");
                    int input = scan.nextInt();
                    while (input != 0){
                        int decimal = input % 2;
                        Node obj2 = new Node(decimal);
                        obj1.push(obj2);
                        input /=2;
                    }
                    System.out.println();
                    System.out.println("Biner dari " + input + "adalah :");
                    while (!(obj1.isEmpty())){
                        obj1.pop();
                        System.out.println();
                    }
                    System.out.println();
                    break;
                     */
                case 7 :
                    System.out.println("وَ السَّلاَمُ عَلَيْكُمْ وَرَحْمَةُ اللهِ وَبَرَكَاتُهُ ( Wassalamu 'alaikum Wr. Wb)");
                    return;
                default:
                    System.out.println("There are no option more than 7");
            }
        }while (end == false);
    }
}
