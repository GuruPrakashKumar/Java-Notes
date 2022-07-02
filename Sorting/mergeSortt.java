public class mergeSortt {
    public static int[] merge(int a[],int b[]){
        int i = 0;
        int j = 0;
        int k = 0;
        int arr[] = new int[a.length + b.length];
        
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                arr[k] = a[i];
                i++;
                k++;
            }else{
                arr[k] = b[j];
                j++;
                k++;
            }
        }
        while (i<a.length) {
            arr[k] = a[i];
            i++;
            k++;
        }
        while (j<b.length) {
            arr[k] = b[j];
            j++;
            k++;
        }
        return arr;
    }
    public static int[] mergeSortRec(int arr[], int low, int hi){

        if (low == hi) {
            int []baseArr = new int[1];
            baseArr[0] = arr[low];
            return baseArr;
        }
        int mid = (low + hi )/2;
        int []a = mergeSortRec(arr, low, mid);
        int []b = mergeSortRec(arr, mid+1, hi);
        int []fullSortedArray = merge(a, b);
        return fullSortedArray;
    } 
    public static void main(String[] args) {
        int arr1[] = {1,2,7,9,2,3,4,6,10};

        int arr2[] = mergeSortRec(arr1, 0, arr1.length-1);
        for (int i : arr2) {
            System.out.print(i+" ");
        }
    }    
}
