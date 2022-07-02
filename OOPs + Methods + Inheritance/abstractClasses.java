abstract class Parent{
    public Parent(){
        System.out.println("Mai parent ka constructor hoon");
    }
    public void seyHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class Child2 extends Parent{
    public void th(){
        System.out.println("I am good");
    }
}
public class abstractClasses {
    public static void main(String[] args) {
        // Parent p = new Parent(); -- error
        Child c = new Child();
        // Child2 ch = new Child2(); -- error
    }    
}
