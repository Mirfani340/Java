package com.linkedList;

public class linkedList {
    public Node head;
    Node tail;
    Node sorted;
    public boolean isEmpty(){
        return head == null;
    }
    public void printNode(){
        Node temp;
        temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void addFirst(Node input){
        if (isEmpty()){
            head = input;
            tail = input;
        }else {
            input.next = head;
            head = input;
        }
    }

    public void bubbleShort(){
        Node current = head, index = null;
        int temp;
        if(head == null) {
            return;
        }else {
            while(current != null) {
                index = current.next;
                while(index != null) {
                    if(current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
    public Node selectionSort(){
        Node a, b, c, d, r;
        a = b = head;
        while (b.next != null) {
            c = d = b.next;
            while (d != null) {
                if (b.data > d.data) {
                    if (b.next == d) {
                        if (b == head) {
                            b.next = d.next;
                            d.next = b;
                            r = b;
                            b = d;
                            d = r;
                            c = d;
                            head = b;
                            d = d.next;
                        }else {
                            b.next = d.next;
                            d.next = b;
                            a.next = d;
                            r = b;
                            b = d;
                            d = r;
                            c = d;
                            d = d.next;
                        }
                    }else {
                        if (b == head) {
                            r = b.next;
                            b.next = d.next;
                            d.next = r;
                            c.next = b;
                            r = b;
                            b = d;
                            d = r;
                            c = d;
                            d = d.next;
                            head = b;
                        }else {
                            r = b.next;
                            b.next = d.next;
                            d.next = r;
                            c.next = b;
                            a.next = d;
                            r = b;
                            b = d;
                            d = r;
                            c = d;
                            d = d.next;
                        }
                    }
                }else {
                    c = d;
                    d = d.next;
                }
            }
            a = b;
            b = b.next;
        }
        return head;
    }
    //
    public void insertionSort() {
        Node headref = head;
        sorted = null;
        Node current = headref;

        while (current != null) {
            Node next = current.next;
            sortedInsert(current);
            current = next;
        }
        head = sorted;
    }
    private void sortedInsert(Node newnode) {

        if (sorted == null || sorted.data >= newnode.data)
        {
            newnode.next = sorted;
            sorted = newnode;
        }else {
            Node current = sorted;
            while (current.next != null && current.next.data < newnode.data) {
                current = current.next;
            }
            newnode.next = current.next;
            current.next = newnode;
        }
    }
    //
    public void clear(){
        head = null;
    }
}
