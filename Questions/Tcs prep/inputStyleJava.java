import java.io.*;
import java.util.*;
public class inputStyleJava{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String s = br.readLine();
            // int a = Integer.parseInt(br.readLine());
            // int b = Integer.parseInt(br.readLine());
            
            // System.out.println(a);
            // System.out.println(b);

            String arr1[] = s.split(",");
            int arr[] = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr[i] = Integer.parseInt(arr1[i].trim());
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}