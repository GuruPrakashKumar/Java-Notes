import java.util.*;
public class matchingOfString {
    static boolean checkPattern(String str1, String str2){
        int i,j;
        int n = str1.length();
        int m = str2.length();
        for(i = 0;i<n;i++){
            if(str1.charAt(i)==str2.charAt(0)){
                for(j=0;j<m;j++){
                    if(str1.charAt(i+j) != str2.charAt(j)){
                        break;
                    }
                }
                if(j==m){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1= sc.nextLine();
        String s2= sc.nextLine();
        boolean flag = checkPattern(s1, s2);
        if(flag){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
        sc.close();
        
    }
}
