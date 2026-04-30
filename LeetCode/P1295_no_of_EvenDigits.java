package LeetCode;
//Find Numbers with Even Number of Digits
public class P1295_no_of_EvenDigits {
    static int findNum(int []arr){
        int count=0;
        for(int i:arr){
            if(even(i)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int a){
        int no_of_digits=digits(a);
        return no_of_digits%2==0;
    }
    static int digits(int n){
        if(n<0){
            n=n*-1;
        }
        return (int) (Math.log10(n)+1);
    }
    public static void main(String[] args) {
        int []arr={143,8,9,256,7958,7};
        int ans=findNum(arr);
        System.out.println(ans);

    }
}
