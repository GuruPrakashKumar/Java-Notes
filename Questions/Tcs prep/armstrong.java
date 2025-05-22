import java.util.*;
public class armstrong{
    public static int countDigit(int n){
        int count = 0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }
    public static boolean isArmstrong(int n){
        int num = n;
        int sum = 0;
        int cnt = countDigit(n);
        while(n>0){
            int ld = n%10;
            int res = (int) Math.pow(ld, cnt);
            sum += res;
            n/=10;
        }
        return sum==num;
    }
    public static void main(String[] args){
        for (int i = 0; i < 1000; i++) {
            if(isArmstrong(i))
                System.out.print(i+" ");
        }
    }
}