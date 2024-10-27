import java.util.Scanner;

public class BirthdayParty {

    // Function to find the Greatest Common Divisor (GCD) of two numbers
    // public static int gcd(int a, int b) {
    //     while (b != 0) {
    //         int temp = b;
    //         b = a % b;
    //         a = temp;
    //     }
    //     return a;
    // }
    public static int gcd(int a, int b) {
        if(a>b){//swap
            int t = a;
            a = b;
            b = t;
        }
        int temp = 0;
        while (a!=0) {
            temp = a;
            a = b % a;
            b = temp;
        }
        return temp;

    }

    // Main function to calculate the maximum number of people
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of pieces of the first cake (n) and the second cake (m)
        System.out.println("Enter the number of pieces of the first cake:");
        int n = scanner.nextInt();
        
        System.out.println("Enter the number of pieces of the second cake:");
        int m = scanner.nextInt();
        
        // Finding the GCD of n and m
        int maxPeople = gcd(n, m);

        // Output the result
        System.out.println("The maximum number of people that can attend the party is: " + maxPeople);
    }
}
