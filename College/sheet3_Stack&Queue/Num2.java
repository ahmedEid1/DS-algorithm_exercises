package com.company.StacksQueues;
/*
*  Put the elements on the stack S in ascending order using one additional stack and some
*  additional non-array variables.
* */
public class Num2 {
//..........................................................................
    public static void main(String[]  args){
        Num2 s1 = new Num2(5);
        Num2 s2 = new Num2(5);
        int x,y;
        s1.push(1);
        s1.push(2);
        s1.push(100);
        s1.push(32);
        s1.push(-1);

        for(int i = 0; i < s1.length(); i++)
        {
            //pull the first two elements
            x = s1.pull();
            y = s1.pull();

            //loop until s1 is empty
            while (true) {
                //if x is not bigger put in s2 an make x = y and get a new y
                if (y > x) {
                    s2.push(x);
                    x = y;
                    if (s1.isEmpty())
                        break;
                    y = s1.pull();
                }
                //if x is bigger keep it and put y in s2 and get a new y
                else {
                    s2.push(y);
                    if (s1.isEmpty())
                        break;
                    y = s1.pull();
                }

            }
            //x is the biggest element evey loop (100 in this test)
            //but with every loop s2 move the smaller elements down
            // until it it is sorted in the last one......
            //not sure what it is called and not even sure i understand it T_T
            //but it works so.....+_+
            s1.push(x);
            while(!s2.isEmpty()){
                s1.push(s2.pull());
            }
        }

        while (!s1.isEmpty())
        {
            System.out.println(s1.pull());
        }
    }
//..........................................................................
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
    public Num2(int max){
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
