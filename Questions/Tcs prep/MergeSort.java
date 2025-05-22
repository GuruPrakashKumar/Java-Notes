public class MergeSort {
    public static void mergeSortRec(int arr[], int si, int ei){
        if(si==ei){//base case
            return;
        }

        int mid = si + (ei-si)/2; //(si+ei)/2
        mergeSortRec(arr, si, mid);
        mergeSortRec(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){//merge two sorted subarrays
        int temp[] = new int[ei-si+1]; //i-> (0,3),  j->(4,6)
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i <= mid && j <= ei){
            if(arr[i]<arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        //copy temp array to arr(original array)
        // k = 0;
        for (k = 0, i=si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }
    public static void main(String[] args){
        int arr[] = {3,5,7,1,9,8,6};
        // int arr[] = {6,3,9,5,2,8};
        mergeSortRec(arr, 0, arr.length-1);
        printArray(arr);

        
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }    
}
