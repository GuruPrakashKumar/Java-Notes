import java.util.*;

public class factorialByFunctions {
    public static void factorial(int n){
        if (n<0) {
            System.out.println("invalid number");
            return;
        }

        int factorial=1;
        for (int i = n; i >= 1; i--) {
            factorial=factorial*i;
        }
        System.out.println("The value of factorial is: "+factorial);
        return;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        factorial(n);
    }
}


// ****Another method
// import java.util.*;

// public class factcheck{
//     public static int factorial(int n) {
//         int factorial = 1;
//         for (int i = n; i >= 1; i--) {
//             factorial=factorial*i;

//         }
//         return factorial;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         System.out.println("The factorial is "+factorial(n));
//     }

// }