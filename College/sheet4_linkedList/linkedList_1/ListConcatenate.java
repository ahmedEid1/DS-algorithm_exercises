package com.company.Linked_List.linkedList_1;

/*
    concatenate a list to the beginning of another list
 */

public class ListConcatenate {
    public static void main(String[] args){
        //first List
        LinkedList Alist = new LinkedList();
        Alist.insert('a');
        //second list
        LinkedList Blist = new LinkedList();
        Blist.insert('l');
        //references to both of the lists
        Link first = Alist.referance();
        Link second = Blist.referance();
        //concatenate the second list to the beginning of the first list
        LinkedList result = concatenate(first, second);
        result.display();
    }
    //------------------------------------------------------------

    //the concatenate method.....................................
    public static LinkedList concatenate(Link first, Link second )
    {
        LinkedList complete = new LinkedList();

        Link current = first;
        while (current != null)
        {
            complete.insert(current.getChar());
            current = current.getNext();
        }
        current = second;
        while (current != null)
        {
            complete.insert(current.getChar());
            current = current.getNext();
        }

        return complete;
    }

}
