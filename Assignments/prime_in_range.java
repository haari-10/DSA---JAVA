package Assignment.Function;

import java.util.ArrayList;

public class prime_in_range {
    public static void main(String[] args) {
        int start=2;
        int end=4;
        ArrayList<Integer>ans=prime(start,end);
        System.out.println(ans);

    }
    static ArrayList<Integer> prime(int start, int end){
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=start+1;i<end;i++){
            if(isPrime(i)){
                ans.add(i);
            }

        }
        return ans;
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int i=2;
        while(i*i<=n){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
