import java.util.*;

public class switchcase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        // if(button==1){
        //     System.out.println("Namaste");
        // }
        // else if(button==2){
        //     System.out.println("hello");
        // }
        // else if(button==3){
        //     System.out.println("ciao");
        // }
        // else{
        //     System.out.println("invalid button");

        // }
        switch (button) {
            case 1:
            System.out.println("Hello");
                break;
            case 2:
            System.out.println("Namaste");
                break;
            case 3:
            System.out.println("Ciao");
                break;
            default:
            System.out.println("Invalid button");
                break;
        }
    }
} 