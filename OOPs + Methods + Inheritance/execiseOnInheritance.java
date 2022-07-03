class Circle{
    public int radius;
    Circle(){
        System.out.println("I am non parameterised constructor of circle");
    }
    Circle(int r){
        System.out.println("I am circle parameterised constructor");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    public int height;
    Cylinder(int r,int h){
        super(r);
        System.out.println("I am cylinder parameterised constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*height;
    }
}
class Rectangle{
    int length;
    int breadth;
    public Rectangle(){
        System.out.println("I am a rectangle non parameterised");
    }
    public Rectangle(int l, int b){
        System.out.println("I am parameterised Rectangle");
        this.length = l;
        this.breadth = b;
    }
    public int area(){
        return length*breadth;
    }
}
class Cuboid extends Rectangle{
    int heightOfCuboid;
    public Cuboid(int l,int b,int h){
        super(l, b);
        System.out.println("I am parameterised cuboid");
        this.heightOfCuboid = h;
    }
    public int area(){
        return 2*( (length*breadth) + (length*heightOfCuboid) + (breadth*heightOfCuboid) );
    }
    public int volume(){
        return length*breadth*heightOfCuboid;
    }
}

public class execiseOnInheritance {
    public static void main(String[] args) {
        // Q.1) Create a class Circle and use inheritance to create another class Cylinder from it.
        
        // Circle c = new Circle(12);
        // Cylinder cy = new Cylinder(12, 4);

        // Q.2) Create a class Rectangle and use inheritance to create another class cuboid.Try to keep iit as close to real world scenario as possible.
        //      Create methods for area and volume. Also create getters and setters.

        Rectangle rect = new Rectangle(3,4);
        System.out.println(rect.area());

        Cuboid cu = new Cuboid(2, 4, 5);
        System.out.println(cu.area());
        System.out.println(cu.volume());
    }
    
}
