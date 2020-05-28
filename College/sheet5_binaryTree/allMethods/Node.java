package com.company;

public class Node {
    int i;
    Node rightChild;
    Node leftChild;

    public Node(int i) {
        this.i = i;
    }

    public void displayNode() {
        System.out.println(this.i);
    }
}
