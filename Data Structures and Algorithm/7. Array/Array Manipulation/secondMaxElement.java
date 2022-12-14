import java.util.*;

public class secondMaxElement {

    public static int findMax(int arr[]) {
        int mx = Integer.MIN_VALUE;

        for(int i =0; i<arr.length; i++) {
            if(arr[i] > mx) {
                mx=arr[i];
            }
        }
        return mx;
    }

    public static int findSecondMax(int arr[]) {
        int mx = findMax(arr);

        for(int i =0; i<arr.length; i++) {
            if(arr[i]==mx) {
                arr[i] = Integer.MIN_VALUE;
            }
            
        }

        int secondMax = findMax(arr);
        return secondMax;
    }

    public static void main(String args[]) {
    int arr [] = {9,8,9,6,9,5,8};
    System.out.println("2nd Largest Element is : " + findMax(arr));
    
    }
}