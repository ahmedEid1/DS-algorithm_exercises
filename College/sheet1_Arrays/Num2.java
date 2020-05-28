package com.company.Arrays;

public class Num2 {
    public static void main(String[] args) {
        //declaring first 3D array
        int arr[][][] = new int[5][4][3];
        int i, j, k;
        int num=1;
        for(i =0; i < 5; i++)
        {
            for(j=0; j<4; j++)
            {
                for(k=0; k<3; k++)
                {
                    arr[i][j][k] = num;
                    num++;
                }
            }
        }

        //declaring second 3D array
        int arr1[][][] = new int[5][4][3];
        num=1;
        for(i =0; i < 5; i++)
        {
            for(j=0; j<4; j++)
            {
                for(k=0; k<3; k++)
                {
                    arr1[i][j][k] = num;
                    num++;
                }
            }
        }

        //using the function
        add3D(arr,arr1);

    }
//the method.............................................
    //.......................................
    static void add3D(int[][][] arr, int[][][] arr1){
        //declaring the result array
        // find the bigger size in every dimension
        int x,y,z;
        int i,j,k;
        if(arr.length == arr1.length){
            x = arr.length;
        }else{
            return;
        }
        // 2D
        if(arr[0].length == arr1[0].length){
            y = arr[0].length;
        }else{
            return;
        }
        //3D
        if(arr[0][0].length == arr1[0][0].length){
            z = arr[0][0].length;
        }else{
            return;
        }
        //create the result array with the right size
        int result[][][] = new int[x][y][z];

        //adding the two arrays
        for(i =0; i < x; i++)
        {
            for(j=0; j<4; j++)
            {
                for(k=0; k<3; k++)
                {
                    result[i][j][k] = arr[i][j][k] + arr1[i][j][k];

                }
            }
        }

        //printing the result
        for(i=0; i<3; i++)
        {
            for(j=0; j<4; j++)
            {
                for(k=0; k<2; k++)
                {
                    System.out.print("sum[" +i+ "][" +j+ "][" +k+ "] = " +result[i][j][k]+ "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
