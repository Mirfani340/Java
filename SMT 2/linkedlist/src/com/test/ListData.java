package com.test;
/*
Muhammad Irfani
20104037
SE04B
 */
import com.praktikum.Node;

public interface ListData {
    boolean isEmpty();
    void printNode();
    void addFirst(com.praktikum.Node input);
    void addLast(com.praktikum.Node input);
    void insertAfter(int key, com.praktikum.Node input);
    void insertBefore(int key, com.praktikum.Node input);
    void insert(int index, Node input);
    void replace(int data, int data2);
    void remove(int data);
    void removeFirst();
    void removeLast();
    void find(int data);
    int length();
    void removeAt(int index);
    void clear();
}
