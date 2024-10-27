// This Program gives you the reversed value of the input String by the user


import java.util.*;

public class toReverseAString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Stringg value : ");
        String userInput = sc.nextLine();
        sb.append(userInput);

        for (int i = 0; i < sb.length()/2; i++) {
            
            int front = i;
            int back = sb.length() - 1 - i;
            
            char a = sb.charAt(front);
            char b = sb.charAt(back);

            sb.setCharAt(back, a);
            sb.setCharAt(i, b);
            

        }
        System.out.println("Reversed String : "+ sb);
        
        
    }
    
    
}

