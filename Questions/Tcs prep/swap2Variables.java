public class swap2Variables {
    public static void main(String[] args) {
        int a = 0;
        int b = 4;


        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a = "+a+"\nb = "+b);
    }
}
