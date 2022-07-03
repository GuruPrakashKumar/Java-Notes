// Questions on Strings--
// 1. Take an array of String input from the user & find the cumulative(combined) length of all those strings.

import java.util.*;

public class stringQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String array[] = new String[size];
        int totlength = 0;

        //input
        for (int i = 0; i < size; i++) {
            array[i] = sc.next();
            totlength = totlength + array[i].length();
        }

        System.out.println(totlength);
    }
}
