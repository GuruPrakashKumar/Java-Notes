import java.util.*;
public class palindromeInGivenRange{
	public static boolean palindrome(int n){
		//12321
		int num = n;
		int rev = 0;
		while(n>0){
			int ld = n%10;
			rev = rev*10 + ld;
			n/=10;
		}
		return rev == num;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int count = 0;
		for(int i = start; i <= end; i++){
			if(palindrome(i)){
				System.out.print(i+" ");
				count++;
			}
		}
		
		System.out.println("\ncount is "+count);
	}	
}