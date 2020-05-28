package com.company.StacksQueues;
/*
* Reverse the order of a stack
* using two additional stacks
*
* */
public class Num1 {
//.............................................................
    public static void main(String[] args){
        Num1 s1 = new Num1(5);
        Num1 s2 = new Num1(5);
        Num1 s3 = new Num1(5);

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);

        while(!s1.isEmpty())
        {
            s2.push(s1.pull());
        }

        while(!s2.isEmpty())
        {
            s3.push(s2.pull());
        }

        while(!s3.isEmpty())
        {
            s1.push(s3.pull());
        }

        while (!s1.isEmpty())
        {
            System.out.println(s1.pull());
        }
    }

//.............................................................
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
    public Num1(int max){
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
