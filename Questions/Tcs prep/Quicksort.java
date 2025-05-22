public class Quicksort {
    public static void quickSortRec(int arr[], int si, int ei){
        //Base case
        if(si>=ei) 
            return;

        int pIdx = partition(arr, si, ei);
        //call recursively
        quickSortRec(arr, si, pIdx-1);
        quickSortRec(arr, pIdx+1, ei);
    }
    public static int partition(int arr[], int si, int ei){
        int i = si-1;
        int j = si;
        int pivot = arr[ei];//let pivot is the last element

        for(j = si; j < ei; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        //swap for pivot
        i++;
        swap(arr, i, ei);
        return i;
    }
    public static void main(String[]  args){
        int arr[] = {6,3,9,8,2,5};
        quickSortRec(arr, 0, arr.length-1);
        printArr(arr);
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
