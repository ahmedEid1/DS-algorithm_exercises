package com.company.StacksQueues;
/*
* Transfer elements from stack S1 to stack S2 so that the elements from S2 are in the same order
* as on S1
* */
public class Num3 {
//...........................................................................
public static void main(String[] args)
    {
        Num3 s1 = new Num3(5);
        Num3 s2 = new Num3(5);
        Num3 s3 = new Num3(5);

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);

        while (!s1.isEmpty()) {
            s3.push(s1.pull());
        }

        while (!s3.isEmpty()) {
            s2.push(s3.pull());
        }

        while (!s2.isEmpty())
        {
            System.out.println(s2.pull());
        }
    }
//...........................................................................

    /*
     *
     *
     * stack implementation.......
     *
     * */
    private int top = -1;
    private int[] input;
    private int max;
    private int length = 0;
    //constructor .....
    public Num3(int max){
        this.max = max;
        input = new int[max];
    }

    public boolean isEmpty(){
        return (top < 0);
    }

    public boolean push(int x){
        //check if the stack is full
        if(top >= (max -1)){
            return false;
        }
        else{
            input[++top] = x;
            length++;
            return true;
        }
    }

    public int pull(){
        if(isEmpty()){
            return -1;
        }
        else{
            int x = input[top--];
            length--;
            return x;
        }
    }

    public int length(){
        return length;
    }

}