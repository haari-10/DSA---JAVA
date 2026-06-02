package com.patterns;

public class pattern17 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        for(int i=1;i<2*n;i++){
            int c=i<=n?i:2*n-i;
            int spaces=n-c;
            for(int j=1;j<=n-c;j++){
                System.out.print("  ");
            }
            for(int j=c;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=c;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
