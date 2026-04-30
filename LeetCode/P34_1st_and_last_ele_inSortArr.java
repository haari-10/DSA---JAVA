package LeetCode;
import java.util.Arrays;
public class P34_1st_and_last_ele_inSortArr {
    public static void main(String[] args) {
        int []arr={5,7,7,8,8,9};
        int target=5;
        int [] ans=searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int [] arr,int target){
        int [] ans={-1,1};
        // First occurance of target
        int start=search(arr,target,true);
        int end=search(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }  
   static int search(int [] arr,int target,boolean firstStartIndex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                //potential  ans found
                ans=mid;
                if(firstStartIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
