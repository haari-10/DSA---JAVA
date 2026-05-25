package Assignment.Function;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(232));
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
