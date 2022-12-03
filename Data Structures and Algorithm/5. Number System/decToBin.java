import java.util.Scanner;

public class decToBin {
    public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the Decimal no :");
      int n = sc.nextInt();

      int ans = 0;
      int power = 1;

      while(n>0) {
        int paritydigit = n % 2;
        ans = ans + paritydigit * power;
        power = power * 10;
        n= n / 2;
      }
      System.out.print("Binary Number is : " + ans);
    }
}
