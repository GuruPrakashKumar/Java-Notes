import java.util.*;


class Employee{
    private int id;
    private String name;


    //constructor
    public Employee(){
        id = 00;
        name = "Your name Here";
    }
    //other examples of constructors
    public Employee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public Employee(String myName){
        name = myName;
    }

    //getter - this will return a name
    public String getName() { return name; }
    //setter - this will set name
    public void setName(String n) { name = n; }
    public void setId(int i) { id = i; }
    public int getId() { return id; }
}

public class constructors {
    public static void main(String[] args) {
        // Employee harry = new Employee();
        Employee harry = new Employee("programing with harry",12); //---> this is object of constructor
        // harry.setName("codeWithHarry");
        // harry.setId(34);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }    
}
