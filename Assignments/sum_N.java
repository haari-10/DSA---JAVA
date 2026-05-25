package Assignment.Function;

public class sum_N {
    public static void main(String[] args) {
        int n=3;
        int ans=sum(n);
        System.out.println(ans);

    }
    static int sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
}
