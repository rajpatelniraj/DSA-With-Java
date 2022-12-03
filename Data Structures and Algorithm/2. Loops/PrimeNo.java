import java.util.*;
public class PrimeNo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        
        if(n==2) {
            System.out.println("No is Prime");
        } else{
            boolean isPrime = true;
            for(int i=2; i<=n-1; i++){
                if(n%i == 0) {
                    isPrime = false;
                }
            }

            if(isPrime == true) {
                System.out.println("No is Prime");
            } else{
                System.out.println("No is not Prime");
            }
        }
    }
}
