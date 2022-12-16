import java.util.*;
public class SortArray {
    public static void sortZeroesAndOne(int[] a) {
        int n = a.length;
        int left = 0;
        int right = n-1;

        while(left<right) {
            if(a[left]==1 && a[right]==0) {
                a[left] = 0;
                a[right] = 1;
                left++;
                right--;
            }

            if(a[left]==0)
                left++;
            if(a[right]==1)
                right--;
        }
        
    }

    public static void main(String [] args) {
        int[] a={0,1,1,0,1,1,0};
        sortZeroesAndOne(a);
        for(int element: a) {
            System.out.print(element + " ");
        }
        
    }
    
}
