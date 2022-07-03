import java.util.*;

public class toTakeInputInStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String value : ");
        String name = sc.nextLine();

        sb.append(name);
        System.out.println(sb);

    }
}
