public class binarySearch {
    //recursion
    static int binSearch(int arr[], int left, int right, int e){
        if(right>=left){
            int mid = (left+right) /2;
            if(arr[mid]==e){
                return mid;
            }else if(arr[mid]>e){
                return binSearch(arr, left, mid-1, e);
            }else if(arr[mid]<e){
                return binSearch(arr, mid+1, right, e);
            }
        }
        return -1;
    }
    //iterative
    static int binSearch(int arr[], int e){
        int l = 0;
        int r = arr.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == e){
                return mid;
            }else if(arr[mid] > e){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{5,7,10,12,13,14,18,20};
        System.out.println(binSearch(arr, 0, arr.length-1, 1));
        System.out.println(binSearch(arr, 1));
    }
}
