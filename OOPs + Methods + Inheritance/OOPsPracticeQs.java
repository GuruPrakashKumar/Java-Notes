import java.util.*;

import javax.sound.midi.Synthesizer;

class Employee {
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class CellPhone{
     public void ring(){
        System.out.println("Ringing...");
     }
     public void vibrate(){
        System.out.println("vibrating...");
     }
     public void callFriend(){
        System.out.println("calling Friend...");
     }
}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return side*4;
    }
}
class Rectangle{
    int length;
    int breadth;

    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return (length+breadth)*2;
    }
}
class TommyVecetti{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Runing from the enemy");
    }
    public void fire(){
        System.out.println("firing on the enemy");
    }
}

public class OOPsPracticeQs {
    public static void main(String[] args) {
        // Q. 1) Create a class Employee with following properties and methods:

        // --> Salary       (property) (int)
        // --> name         (Property)(String)
        // --> getSalary    (method returning int)
        // --> getName      (method returning string)
        // --> setName      (method changing name)
        
        Employee harry = new Employee();
        harry.salary = 12000;
        harry.setName("codeWithHarry");
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());

        // Q. 2)Create a class cellphone with methods to print "ringing.." , "vibrating.."

        CellPhone samsung = new CellPhone();
        samsung.vibrate();
        samsung.ring();
        samsung.callFriend();

        // Q. 3) Create a class Square with a method to initiate its side, calculating area, perimeter etc.

        Square sq = new Square();
        sq.side = 5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        // Q. 4) Create a class Rectangle & repeat Q3;

        Rectangle rect = new Rectangle();
        rect.length = 5;
        rect.breadth = 4;

        System.out.println(rect.area());
        System.out.println(rect.perimeter());

        // Q. 5) Create a class TommyVecetti for Rockstar Games capable of hitting(print hitting) , running, firing etc.

        TommyVecetti player = new TommyVecetti();
        player.run();
        player.fire();
        player.hit();

    }
}
