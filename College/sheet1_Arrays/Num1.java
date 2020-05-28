package com.company.Arrays;
import java.util.Random;

public class Num1 {
    public static void main(String[] args) {
        int[] array = { 2, 8, 3, 0, 6 };
        randRemove(array);
    }

    static void randRemove(int[] arr) {
        //make a random object
        Random rand = new Random();
        //loop on the array until you delete everything
        while (arr.length > 0) {
            //choose a random number < the array size
            int index = rand.nextInt(arr.length);
            System.out.println("remove element " + index + " with value of " + arr[index]);
            //make a new array less in size by one
            int[] arr1 = new int[arr.length - 1];
            //copy every element except the selected element(in index) to the new array
            int j = 0;
            int i = 0;
            while(j < arr.length-1){
                //when you find the selected element move the pointer to delete it
                if(i == index){
                    i++;
                    continue;
                }
                arr1[j] = arr[i];
                j++;
                i++;
            }
            //replace the old array with the new one
            arr = arr1;
        }
    }
}

