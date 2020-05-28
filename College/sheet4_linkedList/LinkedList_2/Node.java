package com.company.Linked_List.LinkedList_2;


public class Node {
    private int a;
    private Node next;

    public Node(int a)
    {
        this.a = a;
    }

    public int getInt()
    {
        return a;
    }

    public void setInt(int a)
    {
        this.a = a;
    }

    public Node getNext()
    {
        return next;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }
}
