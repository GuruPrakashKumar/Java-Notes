import java.util.*;

public class stringQ3 {
    public static void main(String[] args) {
        System.out.println("Enter your email ID : ");
        Scanner sc = new Scanner(System.in);
        String email = sc.next();

        int positionOfat = 1 ;

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                positionOfat = i;
                break;
                
            }
        }
        String name = email.substring(0, positionOfat);
        System.out.println(name);

        //**Another method**//

        /* Scanner sc = new Scanner(System.in);
        String email = sc.next();
        
        String userName = "";

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            } else {
                userName += email.charAt(i);
            }
        }
        
        System.out.println(userName); */

    }
}
