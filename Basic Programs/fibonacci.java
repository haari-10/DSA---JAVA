package com.Basics;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(3));
    }
    static int fib(int n){
        int a=0;
        int b=1;
        int i=0;
        while(i<n){
           int c=a+b;
            a=b;
            b=c;
            i++;
        }
        return a;
    }
}
