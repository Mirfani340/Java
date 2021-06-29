/*
Muhammad Irfani
20104037
SE04B
 */
package com.praktikum;
public class QueueClass {
    // Deklarasi Node
    Node depan, belakang;

    // Method isEmpty
    boolean isEmpty(){
        return (depan == null);
    }

    // Method enqueue (untuk menambahkan data pada antrian)
    // Mirip seperti addLast pada method single Linked list
    void enqueue (Node input){
        if (isEmpty()){
            depan = input;
            belakang = input;
        } else {
           belakang.next = input;
           belakang = belakang.next;
        }
    }
    // Method dequeue (untuk mengeluarkan data dari antrian)
    // Mirip seperti removeFirst pada Single LInked List
    // Kalau pakau Node agak susah, jadi ini gunakan void agar mudah
    void dequeue(){
        if (isEmpty()){
            System.out.println("Data Kosong !!");
        } else {
            Node temp = depan;
            System.out.println(temp.data + "\nberhasil dequeue");
            if (depan == belakang){
                depan = belakang = null;
            } else {
                depan = depan.next;
            }
        }
    }

    void show(){
        if (!isEmpty()){
            System.out.print("Antrian = ");
            Node temp = depan;
            while (temp != null){
                System.out.print(temp.data + ", ");
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    // Digunakan untuk hapus data / clear data
    void makeEmpty(){
        // depan = belakang = null; sama saja dengan yang dibawah
        depan = null;
        belakang = null;
        System.out.println("All Data deleted !!");
    }
}
