package LeetCode;

public class P410_SplitArrayLargestSum {
    public static void main(String[] args) {
        int [] arr={7,2,5,10,8};
        int m=6;
        System.out.println(splitArray(arr,m));



    }
    static int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end=end+nums[i];
        }
        while(start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;
            for(int num :nums){
                if(sum+num>mid){
                    sum=num;
                    pieces++;
                }else{
                    sum=sum+num;
                }

            }
            if(pieces<=k){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;

    }
}
