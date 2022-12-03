import java.util.*;
public class CountingNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        int counter = 1;
        while(counter <=n) {
            System.out.println(counter);
        counter ++;
        }

    }
    
}
