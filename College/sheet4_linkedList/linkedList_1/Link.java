package com.company.Linked_List.linkedList_1;

public class Link {
    private char a;
    private Link next;

    public Link(char a)
    {
        this.a = a;
    }

    public char getChar()
    {
        return a;
    }

    public void setChar(char a)
    {
        this.a = a;
    }

    public Link getNext()
    {
        return next;
    }

    public void setNext(Link next)
    {
        this.next = next;
    }
}
