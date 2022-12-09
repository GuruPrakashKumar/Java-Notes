/*
 * It is implicitly invoked by the system
 * The new keyword plays an important role in invoking the constructor
 * It has no return type. It can or cannot return any value to the caller
 * Sub-class cannot inherit parent class constructor
 * A class can have more than one parameterized constructor. But constructors should have different parameters
*/

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
