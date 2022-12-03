import java.util.*;
public class binToDec {
    public static void main(String ars[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the  Binary Number :");
        int n = sc.nextInt();

        int ans = 0;
        int power = 1;

        while(n>0){
            int lastdigit = n % 10;
            ans = ans + lastdigit * power;
            power = power * 2;
            n = n / 10;
        }
        System.out.print( "Decimal Number is :" + ans);
    }
}
