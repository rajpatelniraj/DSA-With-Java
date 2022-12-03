import java.util.*;
public class CharacterPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        char ch = 'A';

        // Outer loop
        for(int line = 1; line <= n; line ++) {
            // Inner loop
            for(int chars = 1; chars <=line; chars ++) {
                System.out.print(ch);
                ch ++;
            }
            System.out.println();
        }
        
    }
}
