package com.praktikum;

public class LinkList implements List{
    // Deklarasi node head and tail
    Node head;
    Node tail;

    //Digunakan apakah kosong apa tidak
    public boolean isEmpty() {
        return head == null;
    }


    public void printNode() {
        Node temp;
        temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addFirst(Node input) {
        if (isEmpty()){
            head = input;
            tail = input;
        }else {
            input.next = head;
            head = input;
        }
    }
    //digunakan untuk meletakkan nilai aid akhir
    public void addLast(Node input) {
        if (isEmpty()){
            head = input;
            tail = input;
        }else {
            tail.next = input;
            tail = input;
        }
    }

    // Digunakan untuk menginputkan setelah suatu data
    public void insertAfter(int key, Node input) {
        Node temp = head;
        boolean found = false;
        do {
            if (temp.data == key){
                input.next = temp.next;
                temp.next = input;
                found = true;
                System.out.println("Input data :" + input.data +
                        " Setelah data " + key +" Sukses");
            }
            temp = temp.next;
        }
        while (temp != null);
        if (!found)
            System.out.println("Data" + key + " tidak ditemukan");
    }

    // Digunakan untuk menginputkan sebelum suati data
    public void insertBefore(int key, Node input) {
        try{
            Node temp = head;
            while (temp != null){
                if (temp.data == key && temp == head){
                    this.addFirst(input);
                    System.out.println("Memasukkan data " + input.data + " sebelum data " + key + " Sukses");
                    break;
                }else if (temp.next.data == key){
                    input.next = temp.next;
                    temp.next = input;
                    System.out.println("Memasukkan data " + input.data + " sebelum data " + key + " Sukses");
                    break;
                }temp = temp.next;
            }
        } catch (Exception e){
            System.out.println("Data" + key + " tidak ditemukan");
        }
    }
    // Digunakan untuk input berdasarkan index
    public void insert(int index, Node input) {
        Node temp = head;
        boolean found = false;
        int i = 0;
        while (temp != null){
            if (index == 0){
                this.addFirst(input);
                found = true;
                System.out.println("Data " +input.data + " Berhasil dimasukkan pada index" + index);
                break;
            }else if (i == index-1){
                input.next = temp.next;
                temp.next = input;
                found = true;
                System.out.println("Data " +input.data + " Berhasil dimasukkan pada index" + index);
                break;
            }else {
                temp = temp.next;
                i++;
            }
        }
        if (!found)
            System.out.println("Index " + index + " data out of bound");
    }
    // Replace data
    public void replace(int data1, int data2) {
        Node temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.data == data1) {
                temp.data = data2;
                found = true;
                System.out.println("Data " + data1 + " Berhasil dimasukkan pada index" + data2);
                break;
            } else temp = temp.next;
        }
    }

    public void remove(int data) {
        try {
            Node temp = head;
            while (temp != null){
                if (temp.next.data == data){
                    temp.next = temp.next.next;
                    System.out.println("Data " + data + " Berhasil dimasukkan pada index" + data);
                } else if (temp.data == data && temp == head){
                    this.removeFirst();
                    System.out.println("Data" + data + "dihapus");
                }temp = temp.next;
            }
        }catch (Exception e){
            System.out.println("Data " +data+" tidak ditemukan" );
        }
    }

    public void removeFirst() {
        Node temp = head;
        if (!isEmpty()){
            if (head == tail){
                head = tail = null;
            }else {
                head = temp.next;
                temp.next = null;
            }
        }else {
            System.out.println("List is empty");
        }
    }

    public void removeLast() {
        Node temp = head;
        if(!isEmpty())
        {
            if(tail == head) {
                head = tail = null;
            }else {
                while(temp.next !=tail) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
                temp = null;
            }
        }
        else System.out.println("Data Kosong!");
    }

    public void find(int data) {
        int i = 0;
        boolean found = false;
        Node temp = head;
        while(temp != null)
        {
            if(temp.data == data)
            {
                found = true;
                System.out.println(data+" ditemukan pada indeks ke-"+i);
            }i++; temp = temp.next;
        }
        if(!found){
            System.out.println("Data tidak ditemukan!");
        }

    }

    public int length() {
        Node temp = head;
        int i=0;
        if(isEmpty()){
            System.out.println("Data kosong !");
        }
        else
            while(temp != null)
            {
                temp = temp.next;
                i++;
            }
        System.out.println("Panjang data : "+i);
        return i;
    }

    public void removeAt(int index) {
        Node n = head;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        n.next = n.next.next;
    }

    public void clear() {
        head = null;
        System.out.println("All Data Has Been Deleted !!!");
    }
}
