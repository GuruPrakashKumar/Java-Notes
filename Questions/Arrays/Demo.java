public class Demo {
    int a;
    Demo(int s){
        s=a;
        System.out.println("hi");

    }
    void Demo(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        Demo d = new Demo(5);
        d.Demo();
    }
}
