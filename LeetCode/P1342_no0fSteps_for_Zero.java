package LeetCode;

public class P1342_no0fSteps_for_Zero {
    public static void main(String[] args) {
        System.out.println(Steps2(123));

    }
    static int Steps1(int n) {
        if(n==0){
            return 0;
        }
        if(n%2==0){
            return 1+Steps1(n/2);
        }
        return 1+Steps1(n-1);
    }
    static int Steps2(int n){
        return helper(n,0);
    }
    static int helper(int n,int c){
        if(n==0){
            return c;
        }
        if(n%2==0){
            return helper(n/2,c+1);
        }
        return helper(n-1,c+1);
    }

}
