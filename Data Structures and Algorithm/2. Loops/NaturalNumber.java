import java.util.*;

public class NaturalNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        int sum = 0;
        int counter = 1;
        
        while(counter<=n) {
            sum = sum + counter;
        counter ++;
        System.out.println(sum +" ");
        }

    }
}
