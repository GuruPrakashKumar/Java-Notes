import java.util.*;
public class longestSubstring {
    public static int solution(String str){
        // String ls = "";
        int maxLength = 0;
        int left = 0;
        // HashSet<Character> set = new HashSet<>();
        for (int right = 1; right < str.length(); right++) {
            if(str.charAt(left) == str.charAt(right)){
                int length  = right-left;
                System.out.println("length is "+ length+ "and right is "+right);
                maxLength = Math.max(maxLength, length);
                left++;
            }
            System.out.println("maxlength = "+ maxLength);
        }

        return maxLength;
    } 
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(solution(str));
    }
}
