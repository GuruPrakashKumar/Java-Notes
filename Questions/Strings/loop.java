import java.util.*;
public class loop {

    public static String reverseInRange(String str, char ch){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int idx = -1;
        for (int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)){
                idx = i;
            }
        }
        if(idx== -1) return str;

        for (int i = 0; i < idx/2; i++) {
        

            char a = sb.charAt(i);
            char b = sb.charAt(idx);

            sb.setCharAt(i, b);
            sb.setCharAt(idx, a);
        }

        return sb.toString();
    }

    public static boolean isAnagram(String str1, String str2){
        String arr1[] = str1.split("");
        String arr2[] = str2.split("");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        boolean flag = true;
        if(arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if(!arr1[i].equals(arr2[i])){
                    flag = false;
                }
            }
        }else{
            flag = false;
        }
        return flag;
        


    }
    public static int countSpecialChars2(String str){
        int count = 0;
        HashMap<Character, Integer> capital = new HashMap<>();
        HashMap<Character, Integer> small = new HashMap<>();
        char arr[] = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if(Character.isUpperCase(arr[i])){
                capital.put(arr[i], i);
            }else{
                small.put(arr[i], i);
            }
        }

        for (char ch : capital.keySet()) {
            if(small.containsKey((char)(ch+32))){
                if(capital.get(ch) > small.get((char)(ch + 32))){
                    count++;
                }
            }
        }


        return count;
    }

    public static int countSpecialChars(String str){
        int count = 0;

        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        //65 - 90
        //97 - 122
        //using two pointer approach
        int first = 0;
        int second = 0;
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=97){
                second = i;
                break;
            }
        }
        // System.out.println(arr[first]+32);
        if(arr[first] >= 97) return count;
        while (second < arr.length) {
            
            if(arr[first] + 32 == arr[second]){
                if(!hs.contains(arr[first])){
                    count++;
                    hs.add(arr[first]);
                }
                first++;
                second++;
            }else if(arr[first] + 32 > arr[second]){
                second++;
            }else{
                first++;
            }

        }

        return count;
    }
    public static void main(String[] args) {
        // String s = "(){}[]";
        // for(int i = 1; i<s.length();i=i+2){
        //     System.out.println("s.charAt(i)" +s.charAt(i));
        //     if(s.charAt(i) != s.charAt(i-1)){
        //         System.out.println("not matched");
        //     }
        // }

        // System.out.println(isAnagram("prakash", "hsakpra"));

        // System.out.println(countSpecialChars("CCc"));

        System.out.println(countSpecialChars2("AbBCab"));
    
    }
}
