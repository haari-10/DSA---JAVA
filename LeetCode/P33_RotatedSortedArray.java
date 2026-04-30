package LeetCode;

public class P33_RotatedSortedArray {
    public static void main(String[] args) {
        int [] arr={7,0,1,2,3,4};
        System.out.println(pivot(arr));
        System.out.println(searchTarget(arr,7));

    }
    static int searchTarget(int [] arr,int target){
        int pivotel=pivot(arr);
        if(pivotel==-1){
            return binsearch(arr,target,0,arr.length-1);
        }
        if(target==arr[pivotel]){
            return pivotel;
        }
        if(target>=arr[0]){
            return binsearch(arr,target,0,pivotel-1);
        }else{
            return binsearch(arr,target,pivotel+1,arr.length-1);
        }
    }
    static int binsearch(int []arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    static int pivot(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid >start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]<=arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
