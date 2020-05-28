package com.company.Linked_List.LinkedList_2;

import java.util.Random;

public class OrderList {
    public static void main(String[] args)
    {
        Random rand = new Random();
        List mylist = new List();
        for (int i = 0; i < 25; i++)
        {
            int a = rand.nextInt(100) + 1;
            mylist.insert(a);
        }

        mylist.display();
    }


}
