import java.util.*;
public class SmallestNumber {

    // Smallest Number
    public static int getSmallest(int numbers[]) {

        //For Smallest Number
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i<numbers.length; i++) {

            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }

        return smallest;

    }

public static void main(String args[]) {
    int numbers [] = {1,2,6,3,5};
    System.out.println("Smallest no is : " + getSmallest(numbers)); 
    
}

}