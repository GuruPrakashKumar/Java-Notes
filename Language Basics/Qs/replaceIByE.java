/* Input a string from the user. Create a new string called ‘result’ in which 
 you will replace the letter ‘e’ in the original string with letter ‘i’ */

import java.util.*;

public class replaceIByE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");

        System.out.print("Enter you String value : ");
        sb.append(sc.nextLine());

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i)=='e') {
                sb.setCharAt(i, 'i');
            }
        }
        System.out.println(sb);
    }
}
