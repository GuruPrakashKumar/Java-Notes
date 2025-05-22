import java.util.*;
import java.io.*;

public class tcsnqt5octproblem {
  public static int[] fact = new int[10];
  
  public static void main(String[] args){
    // ask input from the user untill he provides a positive number
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++){
      int input = sc.nextInt();
      while(input < 0){
        input = sc.nextInt();
      }
      arr[i] = input;
    }
    sc.close();
    
    factorial();
    findStrongNumber(arr, n);
  }
  public static void factorial(){//calculates factorial
    fact[0] = 1;
    for(int i = 1; i < 10; i++){
      fact[i] = i * fact[i-1];
    }
  }
  public static boolean isStrong(int n){
    int num = n;
    int sum = 0;
    while(num>0){
      int ld = num%10;
      sum = sum + fact[ld];
      num /= 10;
    }
    if(sum == n){
      return true;
    }else{
      return false;
    }
  }
  public static void findStrongNumber(int arr[], int n){
    for(int i = 0; i < n; i++){
      if(isStrong(arr[i])){
        System.out.println("yes");
      }else{
        System.out.println("no");
      }
    }
  }
}