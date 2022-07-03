// Questions on Strings--
/* Input a string from the User. create a new string called 'result' in which you will replace the letter 'e' in the orignal string
with letter 'i' */

import java.util.*;

public class stringQ2 {
    public static void main(String[] args) {
        System.out.println("Enter your sentence :");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        String result = "";

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) =='e') {
                result += 'i';
            } else {
                result += sentence.charAt(i);
            }
        }
        System.out.println(result);

    }
}
