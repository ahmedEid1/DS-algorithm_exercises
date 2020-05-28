package com.company.StacksQueues;
/*
*  Write a program that can reverse the order of words of a sentence using stacks
* */
import java.util.Scanner;

public class Num6 {
//.............................................................
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence,please...^^");
        String x = input.nextLine();

        //split the string into words
        String[] arr = x.split(" ");
        //make a stack the same length as the number of words
        Num6 reverse = new Num6(arr.length);

        for (int i = 0; i < arr.length; i++)
       {
           reverse.push(arr[i]);
       }

        //reverse the string
        String output = "";
        for (int i = 0; i < arr.length; i++)
        {
            output += reverse.pull();
            output += " ";
        }

        //print the output
        System.out.println(output);
    }
//...........................................................

    /*
     *
     *
     * stack implementation.......
     *
     * */
    private int top = -1;
    private String[] input;
    private int max;
    private int length = 0;
    //constructor .....
    public Num6(int max){
        this.max = max;
        input = new String[max];
    }

    public boolean isEmpty(){
        return (top < 0);
    }

    public boolean push(String x){
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

    public String pull(){
        if(isEmpty()){
            return "0";
        }
        else{
            String x = input[top--];
            length--;
            return x;
        }
    }

    public int length(){
        return length;
    }
}
