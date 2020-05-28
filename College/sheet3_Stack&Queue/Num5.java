package com.company.StacksQueues;

import java.util.Scanner;
/*
* Write a program that determines whether an input string is a palindrome; that is, whether it
* can be read the same way forward and backward. At each point, you can read only one character
* of the input string; do not use an array to first store this string and then analyze it (except,
* possibly, in a stack implementation). Consider using multiple stacks
 */
public class Num5 {
//stack implementation line->(64)................................................................................................
    public static void main(String[] args){
        int max = 5;
        //use two stacks
        Num5 s1 = new Num5(max);
        Num5 s2 = new Num5(max);

        //1--start a scanner and save the chars in an stack
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < max; i++)
        {
            System.out.println("Enter a character,please...^^");
            char x = input.next().charAt(0);
            s1.push(x);
        }
        //.....................................................

        //2--put half the word in a another stack
        int length = s1.length;

        if (length % 2 == 0)
        {
            //push the second half in an new stack
            for (int i = 0; i < length/2; i++)
             {
                 s2.push(s1.pull());
             }
        }
        else
        {
            //push the chars after the middle element
            for (int i = 0; i < length/2; i++)
            {
                s2.push(s1.pull());
            }
            //remove the middle character
            s1.pull();
        }
        //..............................

        //3--check the two stack together
        int flag = 0;
        for (int i =0; i < length/2; i++)
        {
            if (s1.pull() != s2.pull())
            {
                flag = -1;
                break;
            }
        }

        if(flag == -1)
            System.out.println("the word is not a palindrome word");
        else
            System.out.println("the word is a palindrome word ^_^");
    }
//..................................................................................................................

    /*
    *
    *
    * stack implementation.......
    *
    * */
    private int top = -1;
    private char[] input;
    private int max;
    private int length = 0;
    //constructor .....
    public Num5(int max){
        this.max = max;
        input = new char[max];
    }

    public boolean isEmpty(){
        return (top < 0);
    }

    public boolean push(char x){
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

    public char pull(){
        if(isEmpty()){
            return '0';
        }
        else{
            char x = input[top--];
            length--;
            return x;
        }
    }

    public int length(){
        return length;
    }
}
