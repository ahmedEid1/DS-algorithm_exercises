package com.company.Linked_List.LinkedList_4;

public class link {
    private int a;
    private link next;

    public link(int a)
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

    public link getNext()
    {
        return next;
    }

    public void setNext(link next)
    {
        this.next = next;
    }
}
