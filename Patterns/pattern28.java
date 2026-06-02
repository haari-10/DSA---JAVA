package com.patterns;

public class pattern28 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        for(int i=1;i<=2*n;i++){
            int spaces=i<=n?n-i:i-n;
            int stars=i<=n?i:2*n-i;
            for(int j=1;j<=n-stars;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
