import java.util.*;
public class simplifyPath {
    public static String simplifyPath(String path) {
        // ArrayList<String> arrayList = new ArrayList<>();
        String res = "";
        String arr[] = path.split("/");   
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if(arr[i] != ".." && arr[i] != "." && arr[i] != ""){
                System.out.println("hi");
                sb.append("/").append(arr[i]);
            }
        }
        if(sb.toString().length()==0){
            return "/";
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "/../";
        String ans = simplifyPath(str);
        System.out.println(ans);
    }
}
