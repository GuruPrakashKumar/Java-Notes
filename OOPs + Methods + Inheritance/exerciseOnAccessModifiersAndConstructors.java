import java.util.*;
class Cylinder{
    private int radius;
    private int height;
    public Cylinder(int radius,int height){
        this.height=height;
        this.radius=radius;
    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public double getSurfaceArea(){
        return (2*Math.PI*radius)*(radius+height);
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
class Rectangle{
    private int length;
    private int breadth;
    public Rectangle(){
        length=4;
        breadth=5;
    }
    public Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void setLength(int length){
        this.length = length;
    }
    public int getLength(){
        return length;
    }
    public void setBreadth(int breadth){
        this.breadth = breadth;
    }
    public int getBreadth(){
        return breadth;
    }
    
}

public class exerciseOnAccessModifiersAndConstructors {
    public static void main(String[] args) {
        // Q1) Create a class Cylinder and use getters and setters to set its radius and height.
        // Cylinder c = new Cylinder();
        // c.setHeight(12);
        // c.setRadius(9);
        
        // System.out.println(c.getHeight());
        // System.out.println(c.getRadius());
        
        // Q2) Use Q1 to calculate surface area and volume of the cylinder.
        
        // System.out.println(c.getSurfaceArea());
        // System.out.println(c.volume());
        
        // Q3) Use a constructor and repeat Q1.
        
        // Cylinder c = new Cylinder(23,24);
        
        // Q4) Overload a constructor used to initiate a rectangle of known length 4 and breadth 5 for using custom parameter
        Rectangle r = new Rectangle();
        r.setLength(10);
        System.out.println(r.getLength());
        Rectangle t = new Rectangle(34,65);
        System.out.println(t.getBreadth());
    }    
}
