import java.util.*;

public class recursionSums {
    // to print fibbonacci series
    public static void printFib(int a,int b,int n){
        if (n==0) {
            return;
        }
        int c = a+b;
        System.out.print(c+" ");
        printFib(b, c, n-1);
        
    }
    public static int calcPower(int x,int n){ // Stack height -- n
        // to print x power n (stack height = n)
        if (x==0) {
            return 0;
        }else if (n==0) {
            return 1;
        }else{
            return x*calcPower(x, n-1);
        }
    }
    public static int calculatePower(int x,int n){
        // to print x power n (stack height = logn)
        if (x==0) {
            return 0;
        } else if(n==0) {
            return 1;
        }
        if (n%2==0) {
            return calculatePower(x, n/2)*calculatePower(x, n/2);
        } else {
            return x*calculatePower(x, n/2)*calculatePower(x, n/2);
        }
    }
    public static void reverseString(String str, int idx){
        // reverse a String
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverseString(str, idx-1);
    }
    public static boolean sortedArray(int index,int ...arr){
        // State that the array is strictly increasing or not
        if (index == arr.length-1) {
            return true;
        }
        if (arr[index]<arr[index+1]) {
            // array is sorted till now
            return sortedArray(index+1, arr);
        }else{
            return false;
        }       
    
    }
    public static void moveAllX(String str, int index, String newString,int count){
        //move all 'x' to the last of the string
        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        if (str.charAt(index)!='x') {
            newString += str.charAt(index);
            moveAllX(str, index+1, newString,count);
        } else {
            count++;
            moveAllX(str, index+1, newString,count);
        }
    }
    // remove all duplicates characters from a string
    public static char map[] = new char[26];
    public static void removeDuplicates(String str, int index, String newString){
        if (index == str.length()) {
            for (int i = 0; i < map.length; i++) {
                newString += map[i];
            }
            System.out.println(newString);
            return;
        }
        
        char currChar = str.charAt(index);
        if (map[currChar-'a']==currChar) {
            removeDuplicates(str, index+1,newString);
        } else {
            map[currChar - 'a'] = currChar;
            removeDuplicates(str, index+1,newString);
            
        }
    }
    public static void subsequences(String str, int index, String newString){
        // print the subsequences of a string
        if (index==str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);

        //To be
        subsequences(str, index+1, newString+currChar);

        //or not to be
        subsequences(str, index+1, newString);
    }
    public static void uniquesubsequences(String str, int index, String newString, HashSet set){
        // print the subsequences of a string
        if (index==str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
            }
            return;
        }

        char currChar = str.charAt(index);

        //To be
        uniquesubsequences(str, index+1, newString+currChar, set);

        //or not to be
        uniquesubsequences(str, index+1, newString,set);
    }
    public static ArrayList<Integer> list = new ArrayList<>();
    public static void getStairs(int totalStairs, int currStair){
        if (currStair==totalStairs-1) {
            list.add(1);
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
            return;
        }
        

        getStairs(totalStairs-1, currStair+1);
        getStairs(totalStairs-2, currStair+2);
        getStairs(totalStairs-3, currStair+3);
        
    }
    
    public static void main(String[] args) {
        /*
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int n = 10;
        printFib(a, b, n-2);
        */

        /*
        System.out.println(calcPower(2, 5));
        */

        /*
        System.out.println(calculatePower(2, 5));
        */
        
        /*
        String str = "abcd";
        reverseString(str, str.length()-1);
        */

        /*
        int arr[] = {2,3,4,6,5};
        if (sortedArray(0, arr)) {
            System.out.println("sorted");
        }else{
            System.out.println("not sorted");
        }
        */

        /*
        String str = "axbcxxd";
        moveAllX(str, 0, "", 0);
        */
        
        /*
        String str = "abbccd";
        removeDuplicates(str, 0, "");
        */

        String str = "abc";
        subsequences(str, 0, "");

        // String str = "aaa";
        // HashSet<String> set = new HashSet<>();
        // uniquesubsequences(str, 0, "", set);

        // int totalStairs = 3;
        // getStairs(totalStairs, 0);

    }
}
