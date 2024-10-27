import java.util.*;
public class primeInAGivenRange {
    public static boolean isPrime(int n){
        if(n == 0 || n == 1){
            return false;
        }
        boolean flag = true;
        for(int i = 2; i <= n/2; i++){
            if(n%i == 0){
                flag = false;
            }
        }

        return flag;
    }
    public static void sieveOfEratosthenes(int n){
        int sieve[] = new int[n+1];
        Arrays.fill(sieve, 1);
        sieve[0] = 0;
        sieve[1] = 0;
        for (int i = 2; i*i <= n; i++) {
            if(sieve[i]==1){
                for (int j = i*i; j <= n; j += i) {
                    sieve[j] = 0;
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            if(sieve[i]==1){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int start = sc.nextInt();
        // int end = sc.nextInt();

        // for (int i = start; i <= end; i++) {
        //     if(isPrime(i)){
        //         System.out.print(i+" ");
        //     }
            
        // }

        //Sieve of eratosthenes
        sieveOfEratosthenes(200);
    }
}
