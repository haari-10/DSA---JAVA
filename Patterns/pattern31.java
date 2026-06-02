package com.patterns;

public class pattern31 {
    public static void main(String[] args) {
        print(4);

    }

    static void print(int n) {

        int m=2*n-2;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= m; j++) {
                int c = n-Math.min(Math.min(i, j), Math.min(m - i, m - j));
                System.out.print(c+" ");

            }
            System.out.println();
        }
    }
}
