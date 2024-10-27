public class lcm {
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a % b);
    }
    public static int getLcm(int a, int b){
        return (a*b)/gcd(a, b);
    }
    public static void main(String[] args) {
        System.out.println(getLcm(10, 15));
    }
}
