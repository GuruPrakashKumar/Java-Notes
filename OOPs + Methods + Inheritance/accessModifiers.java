import java.util.*;

class Employee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}

public class accessModifiers {
    public static void main(String[] args) {
        Employee harry = new Employee();
        // harry.id = 45;
        // harry.name = "codeWithHarry"; --> Throws error due to private access modifiers.
        harry.setName("codeWithHarry");//--> Use setters and getters from the main method.
        harry.setId(45);
        System.out.println(harry.getName());
        System.out.println(harry.getId());

    }
}
