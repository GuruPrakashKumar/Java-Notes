import java.util.*;
public class bruteForcePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();//11
        int end = sc.nextInt();//45
        int sum = 0;
        for(int i = start;i<= end;i++){
            boolean flag = false;
            if(i==0 || i == -1 || i==1) continue;
            int temp = Math.abs(i);
            for (int j = 2; j < temp; j++) {
                if(i%j==0){
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.print(i+" ");
                sum += i;
            }
        }
        System.out.println("\n"+ sum);
    }
}
