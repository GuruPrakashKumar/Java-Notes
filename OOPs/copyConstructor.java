class Student{
    String name;
    int roll;
    String password;
    int marks[];

    //shallow copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }
    
    //deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }


    Student(){
        marks = new int[3];
    }
    
}

public class copyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "guru";
        s1.roll = 04;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s1.roll = 05;
        s2.password = "xyz";
        s1.marks[2] = 110;//changing s1 marks

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
        System.out.println("roll of s2 is "+s2.roll);

        //after printing we can see that it also changed s2 marks
        //because copy constructor does not copy completely
        //it just makes a new reference

        String s = "the sky is blue";
    }
}
