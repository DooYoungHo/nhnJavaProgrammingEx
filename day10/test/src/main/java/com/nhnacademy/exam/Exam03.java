package com.nhnacademy.exam;

public class Exam03 {
    public static void main(String[] args) {
        /* 
        Node start = new Node(22);
        start.next = new Node(33);
        start.next.next = new Node(44);
        start.next.next.next = new Node(55); */

        Node start = new Node(22);
        insert(start, 33);
        insert(start, 44);
        insert(start, 55);

        delete(start, 44);

        while(start != null) {
            System.out.println(start.data);
            start = start.next;
        }
    }

    public static Node insert(Node start, int data) {
        if (start == null) {
            return new Node(data);
        }
        
        if (data < start.data) {
            return new Node(data, start);
        }

        Node pointer = start;
        while (pointer.next != null && data > pointer.next.data) {
            pointer = pointer.next;
        }

        pointer.next = new Node(data, pointer.next);

        return start;
    }

    public static Node delete(Node start, int data) {
        if (start == null) {
            throw new NullPointerException();
        }

        if (start.data == data) {
            start = start.next;
            return start;
        }

        Node p = start;
        while(p.next != null) {
            if (p.next.data == data) {
                p.next = p.next.next;
                break;
            }
            p = p.next;
        }
        return start;
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
