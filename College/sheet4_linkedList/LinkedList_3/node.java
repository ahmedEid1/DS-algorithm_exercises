package com.company.Linked_List.LinkedList_3;

public class node {
    private int a;
    private node next;

    public node(int a)
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

    public node getNext()
    {
        return next;
    }

    public void setNext(node next)
    {
        this.next = next;
    }
}
