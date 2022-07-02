import java.util.*;
class Base{
    public Base(){
        System.out.println("I am a constructor");
    }
    public Base(int x){
        System.out.println("I am a overloaded constructor of Base with value of x as: "+x);
    }
}
class Derived extends Base{
    public Derived(){
        // super(0);
        System.out.println("I am a derived class constructor");
    }
    public Derived(int x,int y){
        super(x);
        System.out.println("I am a overloaded constructor of Derived with value of y as: "+y);
    }
}
class ChildOfDerived extends Derived{
    public ChildOfDerived(){
        System.out.println("I am a child of Derived constructor");
    }
    public ChildOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am an overloaded constructor child of Derived with value of z as : "+z);
    }

}

public class constructorsInInheritance {
    public static void main(String[] args) {
    //  Base b = new Base();
    // Derived d = new Derived();
    // Derived d = new Derived(2,3);
    ChildOfDerived cd = new ChildOfDerived(1,2,3);
    }    
}
