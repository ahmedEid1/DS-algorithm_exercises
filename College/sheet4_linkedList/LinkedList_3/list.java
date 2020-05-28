package com.company.Linked_List.LinkedList_3;

public class list {
    private node first;

    public list(){
        first = null;
    }
    public boolean isEmpty()
    {
        return (first == null);
    }

    public node referance()
    {
        return this.first;
    }

    public void insert(int a)
    {
        node newLink = new node(a);

        node current = first;
        node pre = null;

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
        node current = first;

        while (current != null)
        {
            System.out.println(current.getInt());
            current = current.getNext();
        }
    }


}
