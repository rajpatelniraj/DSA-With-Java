import java.util.*;
public class BinomialCoefficient {

    // Factorial Function
    public static int  factorial(int n) {
      
        int f = 1;
        for (int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }

// BinomialCoeffcient Function
public static int binomialCoef(int n, int r) {
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_nmr = factorial(n-r);

    int binomialCoef = fact_n/(fact_r*fact_nmr);
    return binomialCoef;
}

// Main Function
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the n : ");
    int n = sc.nextInt();

    System.out.print("Enter the r : ");
    int r = sc.nextInt();
    
    System.out.println(binomialCoef(n,r));
    
}

}

