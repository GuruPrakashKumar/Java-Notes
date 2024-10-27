import java.util.*;
public class jumpGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = 1000;
        double time = sc.nextDouble();
        // double val = 5.5;
        
        int speed =  (int) (distance/time);
        System.out.println(speed);
    }
}
