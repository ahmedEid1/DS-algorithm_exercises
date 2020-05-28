package com.company.Linked_List.LinkedList_4;


import com.company.Linked_List.LinkedList_2.List;

import java.util.Random;

public class reverseList {
    public static void main(String[] args){
        linkedList mylist = new linkedList();

        mylist.insert(1);
        mylist.insert(2);
        mylist.insert(3);

        mylist.display();

        linkedList reversedList = reverseCopy(mylist);
        reversedList.display();
    }

    public static linkedList reverseCopy(linkedList l)
    {
        linkedList reverse = new linkedList();

        link current = l.referance();
        while (current != null)
        {
            reverse.insert(current.getInt());
            current = current.getNext();
        }
        return reverse;
    }

}
