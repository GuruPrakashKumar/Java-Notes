// A java program to demonstrate use
// of static keyword with Classes

import java.io.*;

public class staticClass {

    private static String str = "GeeksforGeeks";

    // Static class
    static class MyNestedClass {
      
        // non-static method
        public void disp(){ 
          System.out.println(str); 
        }
    }
    public static void fun(){
        System.out.println("hello");
    }
  
    public static void main(String args[])
    {
        // staticClass.MyNestedClass obj
        //     = new staticClass.MyNestedClass();
        // obj.disp();
        MyNestedClass m = new MyNestedClass();
        m.disp();
        // staticClass s = new staticClass();
        fun();
        System.out.println(str);
    }
}
