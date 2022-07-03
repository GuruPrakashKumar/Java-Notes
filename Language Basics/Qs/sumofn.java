// Print the sum of First n Natural numbers.
import java.util.*;

public class sumofn {
    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum=sum+i;
        }
        System.out.print("The sum of first ");
        System.out.print(n);
        System.out.println(" natural numbers is : ");
        System.out.println(sum);

    }
}