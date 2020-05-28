package com.company.Arrays;

public class Num4 {
    public static void main(String[] args) {
        //test case....................
        int n = 7;
        int[] arr = new int[n];
        for(int i = 1; i < n-4; i++){
            arr[i-1] = i;
        }

        int x = 2;
        arr [n-1] = arr[x];
        arr [n-2] = arr[x];
        arr [n-3] = arr[x];
        arr [n-4] = arr[x];
        arr [n-5] = arr[x];
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
            if(count[i] > 1){
                if(i == 0){
                    System.out.println("the array contains zero");
                    break;
                }
                System.out.println(arr[i-1]);
                break;
            };
        }
        if(i == n){
            System.out.println("there is no reaped elements ");
        }
    }
}
