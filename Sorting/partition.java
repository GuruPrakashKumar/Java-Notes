public class partition {
    // function to making partition between a pivot
    public static int[] part(int[] arr,int pivot){
        int i = 0;
        int j= 0;
        // some points to be understand-->
        // 1) unknown elements will be between (i to arr.length)
        // 2) according to this code elements bigger than pivot will lie in (j to i-1)
        // 3) elements smaller and equal to pivot lie in (0 to j-1) 
        while(i<arr.length){
            if (arr[i]<=pivot) {
                i++;

            }else{
                swap(arr,i,j);
                i++;
                j++;
            }
        }
        return arr;
    }
    public static void swap(int arr[],int i,int j ){
        // swap 2 elements in an array
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    // function to seperate odd even elements in an array
    public static int[] seperateOddEven(int arr[]){
        int i = 0;
        int j=0;
        while (i<arr.length) {
            if (arr[i]%2 == 0) {
                i++;
            }else{
                swap(arr, i, j);
                i++;
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {7,9,4,8,3,6,2,1};
        int arr1[] = part(arr,5);
        System.out.println("seperated array when pivot was 5");
        for (int i : arr1) {
            System.out.print(i+" ");
        }
        
        int arr2[] = seperateOddEven(arr);
        System.out.println("\nseperated array odd even");
        for (int i : arr1) {
            System.out.print(i+" ");
        }
        

    }    
}
