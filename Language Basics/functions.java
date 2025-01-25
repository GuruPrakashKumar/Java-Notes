import java.util.*;

class functions{
    static void printMyname(String name){
        System.out.println(name);
        return;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String naming = sc.next();

        printMyname(naming);
    }
}