public class FibonacciSeries {
    // public static int fibonacciRec(int n) {
    //     if (n <= 1) {
    //         return n;
    //     }
    //     return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    // }
    public static int fibonacciRec(int n) {
        if (n <= 1) {
            return n;
        }
        int a1 = fibonacciRec(n-1);
        int a2 = fibonacciRec(n-2);
        return a1+a2;
    }

    //using DP
    public static int fibDP(int n){
        int dp[] = new int[n+1];
        return fibDP(n, dp);
    }
    public static int fibDP(int n, int dp[]){
        if(n<=1) return n;

        if(dp[n] != 0){
            return dp[n];
        }else{
            // int a = fibDP(n-1);
            // int b = fibDP(n-2);
            // int sum = a+b;
            return dp[n] = fibDP(n-1, dp)+fibDP(n-2, dp);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        int n1 = 0;
        int n2 = 1;
        
        for (int i = 0; i < n; i++) {
            System.out.print(n1+" ");
            int next = n1+n2;
            n1 = n2;
            n2 = next;
        }

        
        System.out.println("Fibonacci Series up to " + n + " terms:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRec(i) + " ");
        }

        System.out.println();
        System.out.println(fibonacciRec(4));
        System.out.println();
        System.out.println(fibDP(n));
    }
}
