import java.util.*;

public class InvertedStar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        for(int line =1; line<=n; line++) {
            for(int star =1; star<=n-line+1; star++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }
}