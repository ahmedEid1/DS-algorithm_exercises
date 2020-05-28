package com.company.Arrays;

public class Num6 {
//.............TEST_FUN................................
    //CUT IT TO A MAIN.JAVA IF IT IS CONFUSING YOU....
    public static void main(String[] args) {
        Num6 matrix = new Num6(2, 2, 2, 2);
        if (!matrix.add())
            System.out.println("can not be added");
        if (!matrix.multi())
            System.out.println("can not be multi");
    }
//......................................................

    //declaring size of the two matrices
    private int r1, r2, c1, c2;
    private int[][] first;
    private int[][] second;

    //constructor.........
    public Num6(int r1, int r2, int c1, int c2) {
        this.r1 = r1;
        this.r2 = r2;
        this.c1 = c1;
        this.c2 = c2;
        first = new int[r1][c1];
        second = new int[r2][c2];
        //fill them with any numbers
        fill(first,r1,c1);
        fill(second,r2,c2);
        //........................
    }
    //........................................

    //adding two matrices
    public boolean add() {
        //ensure the two are same size
        if (r1 != r2 || c1 != c2)
            return false;
        int[][] result = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < r1; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }
        display(result, r1, c1);
        return true;
    }
    //multiplying two matrices
    public boolean multi() {
        //check the condition
        if (c1 != r2)
            return false;
        int[][] result = new int[r1][c2];
        //every row int the first matrix
        for (int i = 0; i < r1; i++) {
            //every column in the second
            for (int j = 0; j < c2; j++) {
                //length of each row == column == r2 == c1
                for (int k = 0; k < r2; k++) {
                    result[i][j] += first[i][k] * second[k][j];
                }
            }
        }
        display(result, r1, c2);
        return true;
    }

//helper methods............................
    //..........1.........
    public void display(int[][] arr, int r, int c) {
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print("result[" + i + "][" + j + "] = " + arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    //.......2............
    public void fill(int[][] arr, int r, int c) {
        int num = 0;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = num++;
            }
        }

    }
}
//................DONE{^_^}.................

