package LeetCode;
import java.util.Arrays;
//https://leetcode.com/problems/missing-number/description/
public class P268_MissingNumber_CycleSort {
    public static void main(String[] args) {
        int []arr={9,6,5,2,3,4,7,0,1};
        Missing(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Missing(arr));

    }
    static int Missing(int [] arr){
        int i=0;
        int min=0;
        while(i<arr.length){
            int correct=arr[i]-min;
            if(arr[i]<arr.length+min && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        //Array got sorted
        //check for first missing value
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+min){
                return j+min;
            }
        }
        //if  n is missing in the array
        return arr.length+min;
    }
    static void swap(int []arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
