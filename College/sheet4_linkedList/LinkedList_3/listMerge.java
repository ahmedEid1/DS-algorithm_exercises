package com.company.Linked_List.LinkedList_3;


public class listMerge {
    public static void main(String[] args){
        //first List
        list Alist = new list();
        Alist.insert(1);
        Alist.insert(6);
        Alist.insert(2);
        Alist.insert(3);
        Alist.insert(5);
        Alist.insert(4);

        //second list
        list Blist = new list();
        Blist.insert(9);
        Blist.insert(7);
        Blist.insert(10);
        Blist.insert(8);

        //references to both of the lists
        node first = Alist.referance();
        node second = Blist.referance();
        //concatenate the second list to the beginning of the first list
        list result = Merge(first, second);
        result.display();
    }
    //------------------------------------------------------------

    //the concatenate method.....................................
    public static list Merge(node first, node second )
    {
        list complete = new list();

        node current = first;
        while (current != null)
        {
            complete.insert(current.getInt());
            current = current.getNext();
        }
        current = second;
        while (current != null)
        {
            complete.insert(current.getInt());
            current = current.getNext();
        }

        return complete;
    }

}
