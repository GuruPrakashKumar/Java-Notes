public class classes{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        // p1.color = "Blue"; // also valid
        System.out.println(p1.color);

        Student s1 = new Student();
        s1.calcPercentage(10, 20, 30);
        System.out.println(s1.percentage);
        
    }
} 

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy + chem + math)/3;
    }

}