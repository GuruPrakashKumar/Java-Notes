/*
Welcome to JDoodle!

You can execute code here in 88 languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
*/
import java.util.*;
import java.io.*;
public class secondLargestSecondSmallest {
  public static void main(String args[]) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String inputarr[] = input.split(" ");
        int arr[] = new int[n];
        for(int i = 0; i < inputarr.length; i++){
            arr[i] = Integer.parseInt(inputarr[i]);
        }
        // Arrays.sort(arr);
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for(int i = 0; i  < arr.length; i++){
            if(arr[i] < small){
                secondSmall = small;
                small = arr[i];
            }else if(arr[i] < secondSmall && secondSmall > small){
              secondSmall = arr[i];
            }
            
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax && secondMax < max){
              secondMax = arr[i];
            }
        }
        System.out.println("small "+ small);
        System.out.println("secondSmall "+ secondSmall);
        System.out.println("max "+ max);
        System.out.println("secondMax "+ secondMax);
        // System.out.println(arr[1]);
        // System.out.println(arr[arr.length-2]);
    }catch(IOException e){
        System.out.println(e);
    }
    
    
  }
}