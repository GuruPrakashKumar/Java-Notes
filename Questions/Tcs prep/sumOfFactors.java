import java.util.*;
import java.io.*;
public class sumOfFactors{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 1;
		for(int i = 2; i <= a/2; i++){
			if(a%i == 0){
				sum += i;
			}
		}
		if(a == 1) System.out.print(false);
		else System.out.print(sum==a);
	}
}