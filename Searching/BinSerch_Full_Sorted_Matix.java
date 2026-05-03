package com.Algorithms.BinarySearch;
import java.util.Arrays;
public class BinSerch_Full_Sorted_Matix {
    public static void main(String[] args) {
        int [][]arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target=3;
        System.out.println(Arrays.toString(search(arr,target)));

    }
    static int [] search(int [][]arr,int target){
        int rows=arr.length;
        int cols=arr[0].length;
        if(rows==1){
            return binarysearch(arr,0,0,cols-1,target);
        }
        int rstart=0;
        int rend=rows-1;
        int cmid=(cols)/2;
        // Run the loop till two rows are remaining
        while(rstart<(rend-1)){//while this is true it will have more than 2 rows, which we are trying to eliminate
            int mid=rstart+(rend-rstart)/2;
            if (arr[mid][cmid]==target){
                return new int []{mid,cmid};
            }
            if(arr[mid][cmid]<target){
                rstart=mid;
            }else{
                rend=mid;
            }
        }
        //now we have 2 rows
        //chech whether the target is in the middle column of 2 rows
        if(arr[rstart][cmid]==target){//checking for 2
            return new int []{rstart,cmid};
        }
        if(arr[rstart+1][cmid]==target){//checking for 6
            return new int []{rstart+1,cmid};
        }
        //search in 1st part
        if(cmid-1>=0 && target<=arr[rstart][cmid-1]){
            return binarysearch(arr,rstart,0,cmid-1,target);

        }
        //search in 2nd part
        if(cmid+1<=cols-1 && target>=arr[rstart][cmid+1] && target<=arr[rstart][cols-1]){
            return binarysearch(arr,rstart,cmid+1,cols-1,target);

        }
        //search in 3rd part
        if(cmid-1>=0 && target<=arr[rstart+1][cmid-1]){
            return binarysearch(arr,rstart+1,0,cmid-1,target);

        }
        //search in 4th part
        if(cmid+1<=cols-1){
            return binarysearch(arr,rstart+1,cmid+1,cols-1,target);
        }
        return new int[] {-1,-1};


    }

    //Search in the row provided between the columns provided
    static int[] binarysearch(int [][]arr,int row,int Cstart,int Cend,int target){
        while (Cstart<=Cend){
            int mid=Cstart+(Cend-Cstart)/2;
            if(arr[row][mid]==target){
                return new int[] {row,mid};
            }
            if(arr[row][mid]<target){
                Cstart=mid+1;
            }else{
                Cend=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}
