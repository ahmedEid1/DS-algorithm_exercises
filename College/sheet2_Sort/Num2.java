/*
* NOT SOLVED YET T_T
* PROGRESS:: NOTHING
*
* NOTES:: NOTHING
*
*
* */
package com.company.sort;

public class Num2 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,5,2,1,0,-5};
        int[] indexArr = new int[arr.length];
        indexArr[0] = 0;

        for (int i = 1; i < arr.length; i++)
        {
            int key = arr[i];
            int j = i -1;

            while (j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
            indexArr[i] = j+1;
        }

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }

}
