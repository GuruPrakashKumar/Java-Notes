public class sol {
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
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10};
        printSubarray(array);
        sumOfSubarrays(array);
        
    }
}
