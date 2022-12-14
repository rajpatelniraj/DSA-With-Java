import java.util.*;

public class FirstRepeatingElement {

    public static int firstRepeatingNumber(int [] arr) {

        int n = arr.length;

        for(int i =0; i<n; i++) { // First Number
            for(int j=i+1; j<n; j++){ // Second Number
                if(arr[i]==arr[j]){ // Found Answer
                    return arr[i]; 
                }
            }
        }
        return -1;
    } 

    public static void main(String args[]) {
        int arr [] = {1,5,3,4,6,3,4};
        System.out.println("First Repeating Element is :"  + firstRepeatingNumber(arr));
    }
    
}
