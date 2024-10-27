import java.util.*;
public class changeCase {
    public static void main(String[] args) {
        String s = "Guru Prakash";
        String ans = "";
        if(s.equals("")){
            System.out.println("Empty string");
        }
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                ans = ans+" ";
            }if(Character.isUpperCase(s.charAt(i))){
                ans = ans+ String.valueOf(Character.toLowerCase(s.charAt(i)));
            }else if(Character.isLowerCase(s.charAt(i))){
                ans = ans+ String.valueOf(Character.toUpperCase(s.charAt(i)));
            }
        }
        System.out.println(ans);
    }
}
