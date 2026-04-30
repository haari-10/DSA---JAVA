package LeetCode;

public class P1095_MountainArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,3,1};
        int target=3;
        int ans=searchTarget(arr,3);
        System.out.println(ans);
       // System.out.println(FindEnd(arr));

    }
    static int searchTarget(int []arr,int target){
        int start=0;
        int peak=FindPeak(arr);
        int end=arr.length-1;
        int firstTry=orderAgnosticBS(arr,target,start,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return orderAgnosticBS(arr,target,peak+1,end);


    }

    static int FindPeak(int []arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    static int orderAgnosticBS(int []arr,int target,int start,int end ){
        boolean isasc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isasc){
                if(target>arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }

        }
        return -1;
    }
}
