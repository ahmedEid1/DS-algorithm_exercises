package com.company.sort;

public class Num4 {
    public static void main(String[] args)
    {
        //test array
        int[] arr = {1,1,5,1,12,525};
        int n = arr.length;
        int temp;

        //loop over the array...except the last item
        for (int i = 0; i < n - 1; i++)
        {
            //set a flag
            int flag = 0;
            //compare elements from zero to (n-1-i)->the last unordered element
            for (int j = 0; j < n-1-i; j++)
            {
                if (arr[j] > arr[j+1])
                {
                 temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
                 //if you make a swap change the flag to true
                 flag = 1;
                }
            }
            //if you did not make any swaps
            // then the array is sorted so break out of the loop
            if (flag == 0)
                break;
        }

        //displaying the ordered array
        for (int i = 0; i < n; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
