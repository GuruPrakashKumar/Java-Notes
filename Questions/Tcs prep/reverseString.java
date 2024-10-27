public class reverseString {
    public static void main(String[] args){
        String s = "hello";
        int i = 0;
        int j = s.length()-1;
        StringBuilder sb = new StringBuilder();
        for (int j2 = 0; j2 < s.length(); j2++) {
            sb.append(s.charAt(j2));
        }
        while(i<j){
            char ch = sb.charAt(i);
            sb.setCharAt(i, s.charAt(j));
            sb.setCharAt(j, ch);
            i++;
            j--;
        }
        System.out.println(sb.toString());
    }
}
