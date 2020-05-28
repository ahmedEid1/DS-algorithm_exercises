package com.company.Linked_List.LinkedList_2;


public class List {
    private Node first;

    public List(){
        first = null;
    }
    public boolean isEmpty()
    {
        return (first == null);
    }

    public Node referance()
    {
        return this.first;
    }

    public void insert(int a)
    {
        Node newLink = new Node(a);

        Node current = first;
        Node pre = null;

        while(current != null && a > current.getInt())
        {
            pre = current;
            current = current.getNext();
        }
        if (pre == null){
            first = newLink;
        }
        else
        {
            pre.setNext(newLink);
        }

        newLink.setNext(current);

        return;

    }

    public int delete()
    {
        int temp = first.getInt();
        first = first.getNext();
        return temp;
    }

    public void display()
    {
        Node current = first;

        while (current != null)
        {
            System.out.println(current.getInt());
            current = current.getNext();
        }
    }


}
