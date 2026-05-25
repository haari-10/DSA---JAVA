package LeetCode;
import java.util.*;
public class P1929_Concatenation {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int []ans=concat(arr);
        System.out.println(Arrays.toString(ans));

    }
    static int [] concat(int [] arr){
        int []ans=new int[2*arr.length];
        for(int i=0;i<ans.length;i++){
            ans[i]=arr[i%arr.length];
        }
        return ans;
    }
}
