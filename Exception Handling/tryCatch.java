/*
 *-> Exceptions in Java
 *  An exception is an event that occurs when a program is executed dissented the normal flow of instructions.
    There are mainly two types of exceptions in java:
    1)Built-in Exceptions 
        *Checked Exceptions
        *Unchecked Exceptions
    2)User-Defined Exceptions
    
    Built-in exceptions are the exceptions that are available in Java libraries.
    These exceptions are suitable to explain certain error situations.
    
    1) Checked exceptions - compile-time exceptions (Handle by the compiler)
       Checked Exceptions: Checked exceptions are called compile-time exceptions because these exceptions are checked at compile-time by the compiler.
    2) Unchecked exceptions - Runtime exceptions
       The unchecked exceptions are just opposite to the checked exceptions. 
       The compiler will not check these exceptions at compile time. 
       In simple words, if a program throws an unchecked exception, and even if we didn’t handle or declare it, the program would not give a compilation error.
    
    Check GFG for more information
    
 *  Commonly Occurring Exceptions
 *  Following are few commonly occurring exceptions in java:

    1) Null pointer exception
    2) Arithmetic Exception
    3) Array Index out of Bound exception
    4) Illegal Argument Exception
    5) Number Format Exception
*/
public class tryCatch {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        // Without Try:
//        int c = a / b;
//        System.out.println("The result is " + c);
        // With Try:
        try {
            int c = a / b;
            System.out.println("The result is " + c);
        }
        catch(Exception e) {
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
