package com.company.Linked_List.LinkedList_4;



public class linkedList {
    private link first;

    public linkedList(){
        first = null;
    }
    public boolean isEmpty()
    {
        return (first == null);
    }

    public link referance()
    {
        return this.first;
    }

    public void insert(int a)
    {
        link newLink = new link(a);

        newLink.setNext(first);
        first = newLink;
    }

    public int delete()
    {
        int temp = first.getInt();
        first = first.getNext();
        return temp;
    }

    public void display()
    {
        link current = first;

        while (current != null)
        {
            System.out.println(current.getInt());
            current = current.getNext();
        }
        System.out.println("______________________________________________________________");
    }


}
