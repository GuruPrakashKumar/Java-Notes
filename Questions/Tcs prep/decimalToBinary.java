public class decimalToBinary {
    //without using string builder
    public static String decToBin(int n){
        String ans = "";
        while(n>0){
            int lastDigit = n&1;
            ans = String.valueOf(lastDigit) + ans;

            n = n>>1;
        }
        return ans;
    }
    public static String decimalToBin(int n){
        StringBuilder sb = new StringBuilder();
        while(n>0){
            int lb = n&1;
            sb.append(lb);
            n = n>>1;
        }
        String s = sb.reverse().toString();
        return s;
    }
    public static void main(String[] args) {
        int a = 15;
        String f = decimalToBin(a);
        System.out.println(f);
        // double b = 5.6;
        // System.out.println((int)(Math.floor(b)));
        String ans = decToBin(a);
        System.out.println(ans);

        //testing
        char ch = 'c';
        System.out.println((int)ch);


    }
}
