import java.util.*;

public class Product {
    public static int product(int num1, int num2) {
        int product = num1 * num2;
        return product;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1 :");
        int a = sc.nextInt();

        System.out.println("Enter num2 :");
        int b = sc.nextInt();

        int product = product(a,b);
        System.out.println( "Product is"+ " " + product);
    }
    
}
