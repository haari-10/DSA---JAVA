package LeetCode;

public class P9_Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
    static boolean isPalindrome(int n){
        int rev=0;
        int m=n;
        while(n>0){
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev==m;
    }
}
