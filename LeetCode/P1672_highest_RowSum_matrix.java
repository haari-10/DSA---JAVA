package LeetCode;


// Richest Customer Wealth (max rowsum)
public class P1672_highest_RowSum_matrix {
    public static void main(String[] args) {
        int [][] arr ={
            {1,2,3},
            {3,2,1,5}
        };
        int ans=rich(arr);
        System.out.println(ans);

    }
    static int rich(int [][]arr){
        int maxval=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max(arr[i])>maxval){
                maxval=max(arr[i]);
            }

        }
        return maxval;
    }
    static int max(int []arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            count=count+arr[i];
        }
        return count;
    }
}
