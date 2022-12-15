import java.util.*;

public class RotatedArray {


    public static void printArray(int arr[] ) {
        for(int i =0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static int[] rotate(int [] arr, int k) {
        int n = arr.length;
        k = k % n;
        int [] ans = new int[n];
        int j = 0;

        for(int i = n-k; i<n; i++) {
            ans[j++] = arr[i];
        }

        for(int i =0; i<n-k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void main(String args[]) {

        int arr [] = {1,2,3,4,5};
        int k = 3;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Array Size");

        // int n = sc.nextInt();
        // int arr[] = new int[n];

        // System.out.println("Enter" + n + "Elements");
        // for(int i = 0; i < n; i++){
        //     arr[i]=sc.nextInt();
        // }

        // System.out.print("Enter k :");
        // int k = sc.nextInt();

        // System.out.println("Original Array");
        // printArray(arr);
        int [] ans = rotate(arr,k);
        // System.out.println("Array after rotation");
        printArray(ans);
        rotate(arr, k);
    }
    
}
