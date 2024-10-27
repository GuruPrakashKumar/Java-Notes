import java.util.*;
class SweetSeventeen{
    public static int valueOf(char ch){
        if(ch=='A'||ch=='a'){
            return 10;
        }else if(ch=='B'||ch=='b'){
            return 11;
        }else if(ch=='C'||ch=='c'){
            return 12;
        }else if(ch=='D'||ch=='d'){
            return 13;
        }else if(ch=='E'||ch=='e'){
            return 14;
        }else if(ch=='F'||ch=='f'){
            return 15;
        }else {
            return 16;
        }
        
    }
    public static int seventeen(String s){
        int sum = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            char ch = s.charAt(i);
            int pow = Math.abs(s.length()-i-1);
            if(Character.isDigit(ch)){
                sum += ((int) Math.pow(17, pow))*Integer.parseInt(String.valueOf(ch));
            }else{
                int value = valueOf(ch);
                sum += value* Math.pow(17,pow);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        System.out.println(seventeen("23gf"));
        // System.out.println(~10);

    }
}