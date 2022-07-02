// merge sort time complexity -- worst: O(n^2)
//                               average: O(nlogn)

// NOTE --- worst case occurs when pivot is always the smallest or the largest elements.
// Difference in merge sort and quick sort ---

// merge sort uses extra arrays so it uses extra memory but 
// quick sort does not use extra arrays so it uses less memory but sometime it's time complexity is more than merge sort.

// when we have extra memory then we should use merge sort otherwise quicksort

public class quickSort {
    public static int partition(int arr[],int low,int hi,int pivot){
        // this function returns index of pivot after partition
        int i = low;
        int j = low;
        while (i <= hi) {
            if (arr[i] <= pivot) {
                i++;
            }else{
                swap(arr,i,j);
                i++;
                j++;
            }
        }
        System.out.println("pivot index -> " + (j - 1));
        return (j-1);
    }
    public static void swap(int arr[],int i,int j ){
        // swap 2 elements in an array
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void quickkSort(int []arr,int low,int hi){

        if (low <= hi) {
            return;
        }

        int pivot = arr[hi];
        int pi = partition(arr, low, hi, pivot);

        quickkSort(arr, low, pi-1);
        quickkSort(arr,pi+1,hi);
    }
    public static void main(String[] args) {
        int[] arr = {2,5,6,9,1,7};
        quickkSort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
