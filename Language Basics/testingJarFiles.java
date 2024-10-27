//to create jar files
// 1. compile java programs and get the .class files
// 2. stay on the same directory where the .class files are and open the terminal
// 3. execute this command: jar --create --file Jar_File_Name.jar Java_Class_FileName.class
// 4. you will see a jar file generated in the same directory. now we can use the program anywhere
// 5. execute the jar file directly using this command: java -cp Jar_File_Name.jar Java_Program_Name

public class testingJarFiles {
    public static void main(String[] args) {
        int a = recursion.factorial(4);
        System.out.println(a);
    }
}
