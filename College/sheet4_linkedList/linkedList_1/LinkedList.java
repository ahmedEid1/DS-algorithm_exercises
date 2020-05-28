package com.company.Linked_List.linkedList_1;

public class LinkedList {
    private Link first;

    public LinkedList(){
        first = null;
    }
    public boolean isEmpty()
    {
        return (first == null);
    }

    public Link referance()
    {
        return this.first;
    }

    public void insert(char a)
    {
        Link newLink = new Link(a);

        newLink.setNext(first);
        first = newLink;
    }

    public char delete()
    {
        char temp = first.getChar();
        first = first.getNext();
        return temp;
    }

    public void display()
    {
        Link current = first;

        while (current != null)
        {
            System.out.println(current.getChar());
            current = current.getNext();
        }
    }

}
