import java.util.*;

public class freqOfWord{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String arr[] = str.split(" ");
		HashMap<String, Integer> hm = new HashMap<>();
		for(int i = 0; i < arr.length; i++){
			if(hm.containsKey(arr[i])){
				hm.put(arr[i], hm.get(arr[i])+1);
			}else{
				hm.put(arr[i], 1);
			}
		}

		//for(String word: hm.keySet()){
		//	System.out.println(word+" "+hm.get(word));
		//}

		for(int i = 0; i < arr.length; i++){
			if(hm.containsKey(arr[i])){
				System.out.println(arr[i]+" "+hm.get(arr[i]));
				
				hm.remove(arr[i]);
			}
		}
	}
}