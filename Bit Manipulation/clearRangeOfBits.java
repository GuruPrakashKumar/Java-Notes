public class clearRangeOfBits{
    public static int clearRangeOfBitsFunc(int i, int j, int n){
        //first derive bitmask
        // bitmask will be a|b
        int a = (~0) << j+1;
        int b = (1 << i) - 1;

        int bitmask = a|b;
        return n & bitmask;
    }

    
    public static int countSetBits(int n){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){//check if LSB is 1
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        // System.out.println(clearRangeOfBitsFunc(2, 4, 10));
        System.out.println(countSetBits(15));
    }
}