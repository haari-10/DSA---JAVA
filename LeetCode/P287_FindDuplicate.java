package LeetCode;

public class P287_FindDuplicate {
    public static void main(String[] args) {
        int []arr={1,1,3,4,2};
        System.out.println(miss(arr));

    }
    static int miss(int []arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1){
                int correct=arr[i]-1;
                if(arr[i]!=arr[correct]){
                    swap(arr,i,correct);
                }else{
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        return -1;
//        while(i<arr.length){
//            int correct=arr[i]-1;
//            if(arr[i]!=arr[correct]){
//                swap(arr,i,correct);
//            }else{
//                i++;
//            }
//        }
//        for(int j=0;j<arr.length;j++){
//            if(arr[j]!=j+1){
//                return arr[j];
//            }
//        }
//        return -1;
    }
    static void swap(int []arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
