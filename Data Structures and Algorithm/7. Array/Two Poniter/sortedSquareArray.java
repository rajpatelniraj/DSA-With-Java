import java.util.*;

public class sortedSquareArray{

    public static void reverse(int[] arr) {
        int i = 0, j=arr.length-1;
        int temp =0;
        while(i<j) {
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static int[] sortSquares(int[] arr) {
        int n= arr.length;
        int left = 0, right = n-1;
        int[] ans = new int[n];
        int k=0;

        while(left<=right) {
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }
            else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String [] args) {
        int [] arr = {-10,-3,2,5,6};
       
        System.out.println( sortSquares(arr));
    
        
        
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter array size");

    //     int n = sc.nextInt();
    //     int arr[] = new int[n];

    //     System.out.println("Enter"+ n + "elements");
    //     for(int i = 0; i<n; i++){
    //         arr[i]= sc.nextInt();
    //     }

    //     System.out.println("Original Array:");
    //     printArray(arr);
    //     int[] ans = sortSquares(arr);

    //     System.out.println("Sorted array :");
    //     printArray(ans);
        
     }
}