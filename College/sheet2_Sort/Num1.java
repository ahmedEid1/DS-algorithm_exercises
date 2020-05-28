package com.company.sort;
//(note)* Num1 -> bucketsort
public class Num1 {
        //the array to be sorted
        private int[] A;
        //the the 2D array that contsin 10 bucket(0->9)
        private int[][] B;
        //
        private int N;
        private int filled;
        //constructor....................
        public Num1(int max){
            A = new int[max];
            B = new int[10][max];
            N = max;
        }
        //........................
        //to fill the array.........
        public void insert(int num){
            if(filled==N)
                return;
            else{
                A[filled] = num;
                filled++;
            }
        }
        //...............................
        //a helper fun. to see the progress.....
        private void displayB(int p){
            System.out.println("round:: " +(p+1));
            for (int k = 0; k < 10; k++) {
                for (int h = 0; h < N; h++) {
                    System.out.print(B[k][h]+"_");
                }
                System.out.println("");
            }
            System.out.println("   __________     ");
        }
        //............................................

        //here is were the magic happen ^_^ !_!
        public void sort(){
            //finding the biggest number in the array
            int max = A[0];
            for(int i=1; i<N; i++){
                if(A[i] > max)
                    max = A[i];
            }

            //count the max digits;
            int digits = 0;
            while(max != 0){
                max /= 10;
                digits++;
            }



            int row;
            //loop over the array the number of the digits of the biggest number
            for(int p=0; p<digits; p++) {
                //1-every loop loop over every element in the array
                for (int i = 0; i < N; i++) {
                    //find the bucket to put the element on
                    row = (A[i] / (int)Math.pow(10,p)) % 10;
                    //loop over the bucket(row) until you find a empty place
                    //put the element in it and break
                    for (int j = 0; j < N; j++) {
                        if (B[row][j] == 0) {
                            B[row][j] = A[i];
                            break;
                        }
                    }
                }

                int index = 0;
                //2-return the element from the buckets to the array
                //loop over the buckets
                for (int k = 0; k < 10; k++) {
                    //loop over every bucket
                    for (int h = 0; h < N; h++) {
                        if (B[k][h] != 0) {
                            A[index] = B[k][h];
                            index++;
                            // System.out.print(B[k][h]);
                        }
                        else
                        {
                            break;
                        }

                    }
                    //  System.out.println("");
                }
                //checking the progress....
                displayB(p);
                //...........
                //make the buckets emmpty before the next itteration
                for (int k = 0; k < 10; k++) {
                    for (int h = 0; h < N; h++) {
                        B[k][h] =0;
                    }
                }
            }
        }



        public void display(){
            for(int i=0; i<N; i++){
                System.out.println(A[i]);
            }
        }

        //...................T_E_S_T...........................
        //copy it to Main if you want o_o
        public static void main(String[] args) {
            Num1 test = new Num1(5);

            test.insert(54);
            test.insert(951);
            test.insert(56654);
            test.insert(9951);
            test.display();
            test.sort();
            test.display();
        }
        //.............................................
    }


