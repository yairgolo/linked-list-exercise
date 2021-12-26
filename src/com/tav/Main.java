package com.tav;

import com.tav.linkedlist.LinkedList;
import com.tav.linkedlist.Node;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> stringLinkedList = new LinkedList<>(new Node<>("a"));
        stringLinkedList.add("b");
        stringLinkedList.add("c");
        stringLinkedList.add("d");
        stringLinkedList.print();

        LinkedList<Integer> integerLinkedList = new LinkedList<>(new Node<>(1));
        integerLinkedList.add(5);
        integerLinkedList.add(4);
        integerLinkedList.add(300);
        integerLinkedList.print();
        integerLinkedList.delete(300);
        integerLinkedList.print();
        integerLinkedList.delete(4);
        integerLinkedList.print();
        integerLinkedList.delete(1);
        integerLinkedList.print();
    }
}
