package com.company.sort;

public class Num3 {
    public static void main(String[] args) {
        //test array...................
        int[] arr = {4,3,5,2,1,0,5,-5};
        //insertion sort using binary search...yeah O_o
        for (int i = 1; i < arr.length; i++)
        {
            int key = arr[i];
            //find the place to insert the element
            int index = binarySearch(arr, 0, i-1, key);
            //if the element is bigger than every other element do nothing
            if (index == -1){
                continue;
            }
            //shift the elements the insertion place up
           shiftUp(arr, index, i);
            //insert the element
            arr[index] = key;
            //and done ^_^
        }
        //display the the sorted array
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }
//.............................->>M-E-T-H-O-D-S<<-.....................................
    //binary search method to find the first bigger element than key
    static int binarySearch(int[] arr, int first, int last, int key)
    {
        int index = -1;
        int mid = (first + last) / 2;
        while (first <= last)
        {

            mid = (first + last) / 2;
            if (arr[mid] < key)
            {
                first = mid + 1;
            }

            else
            {
                index = mid;
                last = mid - 1;
            }
        }
        return index;
    }
    //shift the elements up before inserting the  key
    static void shiftUp(int[] arr, int first, int last)
    {
        for (int i = last; i > first; i--)
        {
            arr[i] = arr[i-1];
        }
    }

}

