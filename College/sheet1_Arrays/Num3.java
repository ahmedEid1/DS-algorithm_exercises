package com.company.Arrays;

public class Num3 {
    public static void main(String[] args) {
        //test case....................
        int n = 5;
        int[] arr = new int[n];
        for(int i = 1; i < n; i++){
            arr[i-1] = i;

        }
        arr [n-1] = arr[4];
        //........................
        //testing the method
        findReaped(arr);
    }

    //building the method
    static void findReaped(int[] arr){
        int n = arr.length;
        int[] count = new int[n];
        for(int i = 0; i < n; i++){
            count[arr[i]]++;
        }
        int i;
        for(i = 0; i < n; i++){
            if(count[i] > 1) {
                if (count[i] > 1) {
                    if (i == 0) {
                        System.out.println("the array contains zero");
                        break;
                    }
                    System.out.println(arr[i - 1]);
                    break;
                }
            }
        }
        if(i == n){
            System.out.println("there is no reaped elements ");
        }
    }
}
