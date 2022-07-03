import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st number : ");
        float a = sc.nextInt();
        System.out.print("Enter your 2nd number : ");
        float b = sc.nextInt();
        float answer=1;
        System.out.print("Enter your operator: ");
        
        char userInput = sc.next().charAt(0);
        
        switch (userInput) {
            case '+':answer=a+b;
            break;
            case '-':answer = a-b;
            break;
            case '*':answer = a*b;
            break;
            case '/':answer = a/b;
            break;    
        
            default:
            System.out.println("Error");
                break;
        }

        if (answer ==1) {
            System.out.println("can't be calculated");
        } else {
            System.out.println("result : "+answer);
        }

    }
}
