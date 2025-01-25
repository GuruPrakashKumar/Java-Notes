class Student{
    private static int a;
    void show(){
        System.out.println("a value is "+a);
    }
    void setA(int a){
        this.a = a;
    }
}
public class staticVariables {
    public static void main(String[] args) {
        Student s = new Student();
        s.setA(0);
        // System.out.println("a value is "+s.a);
        s.show();
        Student s1 = new Student();
        s1.setA(5);
        s.show();
        // System.out.println("a value is "+s.a);

    }
}
