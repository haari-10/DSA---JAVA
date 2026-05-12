package com.haari;

public class armstrong {
    public static void main(String[] args) {
        int rv=153;
        int n=rv;
        int r=0;
        while(n>0){
            int m=n%10;
            r+=(m*m*m);
            n=n/10;


        }
    }
}
