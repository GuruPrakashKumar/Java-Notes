import java.util.Scanner;

public class NumberCheckProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Check Armstrong Number");
            System.out.println("2. Check Palindrome Number");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to check for Armstrong: ");
                    int armstrongNumber = scanner.nextInt();
                    if (isArmstrongNumber(armstrongNumber)) {
                        System.out.println(armstrongNumber + " is an Armstrong number.\n");
                    } else {
                        System.out.println(armstrongNumber + " is not an Armstrong number.\n");
                    }
                    break;

                case 2:
                    System.out.print("Enter a number to check for Palindrome: ");
                    int palindromeNumber = scanner.nextInt();
                    if (isPalindromeNumber(palindromeNumber)) {
                        System.out.println(palindromeNumber + " is a Palindrome number.\n");
                    } else {
                        System.out.println(palindromeNumber + " is not a Palindrome number.\n");
                    }
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.\n");
            }
        }
    }
    private static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int result = 0;
        int n = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, n);
            number /= 10;
        }

        return result == originalNumber;
    }
    private static boolean isPalindromeNumber(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber == originalNumber;
    }
}
