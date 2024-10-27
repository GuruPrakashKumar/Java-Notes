import java.util.*;
public class subarrays {
    /// for printing all the subarrays of a given array
    static void printSubarray(int []array){
        int ts=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                System.out.print("[ ");
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k]+" ");
                }
                System.out.print("], ");
                ts++;
            }
            System.out.println();
        }
        System.out.println("total sub arrays = "+ ts);
    }

    /** prints the sum of all the subarrays and also the minimum and the maximum out of them
     by bruteforce method */
    static void sumOfSubarrays(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                System.out.print("[ ");
                for (int k = i; k <= j; k++) {
                    // System.out.print(arr[k]+" ");
                    sum += arr[k];
                }
                if(sum > max) max = sum;
                if(sum < min) min = sum;
                System.err.print(sum);
                System.out.print("], ");
            }
            System.out.println();
        }
        System.out.printf("max sum = %d and min sum = %d",max, min);
    }

    /**
     * getting max subarrays sum by PREFIX SUM method
     * making an array of elements having the sum of prefix values
     * and using it for reducing time complexity */
    static void prefixSum(int arr[]){
        int currSum;
        int maxSum = Integer.MIN_VALUE;
        //for making prefix sum array
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = arr[i] + prefix[i-1];
        }
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(currSum>maxSum) maxSum = currSum;
             }
        }
        System.out.println("max sum = "+maxSum);
    }

    /**
     * in Kadane's algorithm, for getting the max sum of given array, it adds all the elements in the array
     * but takes 0 for negative values
     * draback-> if all elements in the array is negative then the max sum returned by the function will be 0
     */
    static void kadanesAlgo(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("max subarray sum is : "+ maxSum);
    }
    
    public static void main(String[] args) {
        int array[] = {2 , 4, 6, 8, 10};
        // printSubarray(array);
        // sumOfSubarrays(array);
        prefixSum(array);
        int array2[] = {-2 , -3, 40, -100, -2, 1, 5,55, -3};
        kadanesAlgo(array2);
        
    }
}
