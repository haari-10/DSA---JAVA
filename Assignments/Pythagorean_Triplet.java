package Assignment.Function;

public class Pythagorean_Triplet {
    public static void main(String []args){
        int []arr={5,8,7,4,3};
        System.out.println(isTriplet(arr));


    }
    static boolean isTrip(int a,int b,int c){
        if(a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b){
            return true;
        }
        return false;
    }
    static boolean isTriplet(int []arr){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(isTrip(arr[i],arr[j],arr[k])){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
