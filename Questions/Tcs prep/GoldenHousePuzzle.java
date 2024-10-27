import java.util.*;
public class GoldenHousePuzzle {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int ans[] = new int[2];
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int i = 0; 
        int j = 1;
        int sum = arr[i]+arr[j];
        while(j<n && i<=j){
            if(sum == k){
                ans[0] = i+1;
                ans[1] = j+1;
                break;
            }else if(sum>k){
                sum -= arr[i];
                i++;
            }else{
                j++;
                sum += arr[j];
            }

        }

        for (int l = 0; l < ans.length; l++) {
            System.out.print(ans[l]+" ");
        }
    }
}



// import java.util.Scanner;

// public class GoldenHousePuzzle {
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input number of rooms and the target number of coins K
//         // System.out.print("Enter number of rooms (N): ");
//         int N = sc.nextInt();
//         // System.out.print("Enter target number of gold coins (K): ");
//         int K = sc.nextInt();

//         // Input the number of gold coins in each room
//         // System.out.println("Enter the number of gold coins in each room:");
//         int[] coins = new int[N];
//         for (int i = 0; i < N; i++) {
//             coins[i] = sc.nextInt();
//         }

//         // Find the solution and print it
//         findRoomsWithSumK(coins, N, K);
        
//         sc.close();
//     }

//     // Method to find the continuous subsequence with sum exactly K
//     public static void findRoomsWithSumK(int[] coins, int N, int K) {
//         int currSum = 0;
//         int i = 0;

//         // Sliding window to find the subarray with the sum K
//         for (int j = 0; j < N; j++) {
//             currSum += coins[j];

//             // If currSum exceeds K, move the i pointer to reduce the window size
//             while (currSum > K && i <= j) {
//                 currSum -= coins[i];
//                 i++;
//             }

//             // If a valid window is found with sum exactly K, print the i and j room numbers
//             if (currSum == K) {
//                 System.out.println((i + 1) + " " + (j + 1));
//                 return;
//             }
//         }

//         // If no solution is found, which theoretically shouldn't happen as per problem's guarantee
//         System.out.println("No solution found");
//     }
// }