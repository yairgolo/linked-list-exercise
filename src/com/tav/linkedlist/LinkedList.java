package com.tav.linkedlist;

public class LinkedList<T> {
    public LinkedList(Node<T> head) {
        this.head = head;
    }

    private Node<T> head;

    public void add(T data) {
        Node<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new Node<>(data));
    }

    public void delete(T data) {
        // Delete the first Node with the same data
        Node<T> current = head;
        if (data == head.getData()){
            head.setData(head.getNext().getData());
            head.setNext(head.getNext().getNext());
            return;
        }
        while (current.getNext().getData() != data && current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
    }

    public void print() {
        Node<T> current = head;
        while (current.getNext() != null) {
            System.out.print("[" + current.getData() + "] -> ");
            current = current.getNext();
        }
        System.out.print("[" + current.getData() + "]");
        System.out.println();
    }
}
