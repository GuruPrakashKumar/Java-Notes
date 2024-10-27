// import java.util.*;
// public class solution{
//     public static long fun(int[] arr, int n) {
//         List<Integer> ans = new ArrayList<>();
//         int t = 1;
//         if (arr[0] > 0) {
//             t = 0;
//         }
//         int i = 0;
//         while (i < n) {
//             if (t == 0) {
//                 int j = i;
//                 while (j < n && arr[j] > 0) {
//                     j++;
//                 }
//                 int maxVal = arr[i];
//                 for (int k = i + 1; k < j; k++) {
//                     maxVal = Math.max(maxVal, arr[k]);
//                 }
//                 ans.add(maxVal);
//                 i = j;
//                 t = 1;
//             } else {
//                 int j = i;
//                 while (j < n && arr[j] < 0) {
//                     j++;
//                 }
//                 int maxVal = arr[i];
//                 for (int k = i + 1; k < j; k++) {
//                     maxVal = Math.max(maxVal, arr[k]);
//                 }
//                 ans.add(maxVal);
//                 i = j;
//                 t = 0;
//             }
//         }
//         long sum = 0;
//         for (int num : ans) {
//             sum += num;
//         }
//         return sum;
//     }
//     public static void main(String []args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println(fun(arr, n));
//     }
// }
public class Main {
    public static void main(String[] args) {
        int N = 10;
        int result = sumOfHighestSquareAndCube(N);
        System.out.println("The sum for N = " + N + " is: " + result);
    }

    public static int sumOfHighestSquareAndCube(int N) {
        int highestSquare = (int) Math.floor(Math.sqrt(N)) * (int) Math.floor(Math.sqrt(N));
        int highestCube = (int) Math.floor(Math.cbrt(N)) * (int) Math.floor(Math.cbrt(N)) * (int) Math.floor(Math.cbrt(N));
        return highestSquare + highestCube;
    }
}