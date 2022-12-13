import java.util.*;

public class TripletSum {

    // Triplet Sum

    public static int tripletSum(int arr[], int target) {
        int ans = 0;
        int n = arr.length;

        for(int i=0;i<n;i++){ // First Number
            for(int j = i+1;j<n;j++){ // Second Number
                for(int k=j+1;k<n;k++){ // Third Number
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }

                }
            }
        }
        return ans;

        
    }
    public static void main(String args[]) {
        int arr [] = {1,4,5,6,3};
        int target = 12;
        System.out.println("Triplet Sum is : " + tripletSum(arr, target) );
        
    }
}
