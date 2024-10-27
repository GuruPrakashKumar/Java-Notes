import java.util.*;
public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(24);
        // sb.append("hello12345helloh");
        System.out.println(sb.capacity());
        sb.ensureCapacity(28);
        System.out.println(sb.capacity());
        // System.out.println(sb.toString());
    }
}
