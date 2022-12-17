import java.util.*;
public class sortArrayByParity {

    public static int[] sortArray(int [] arr) {
        int n = arr.length;

        int left = 0, right = n-1;

        while(left < right) {
            if(arr[left] % 2 == 1 && arr[right] % 2 == 0) {
              
              
                // swapping the values of arr[left] and arr[
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if(arr[left] % 2 ==0){
                left++;
            }
            if(arr[right] % 2 == 1) {
                right--;
            }
        }
        return arr;
        
    }
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        int [] ans = sortArray(arr);
       
        for(int element: ans) {
            System.out.print(element +" ");
        }
    }
    
}
