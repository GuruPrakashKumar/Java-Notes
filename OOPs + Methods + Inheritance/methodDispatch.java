class Phone{
    public void showTime(){
        System.out.println("Showing Time...");
    }
    public void on(){
        System.out.println("Turning On Phone...");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}

public class methodDispatch{
    public static void main(String[] args) {
        // Phone obj = new Phone(); //--> This is allowed
        // obj.on();
        // SmartPhone obj2 = new SmartPhone();//--> This is allowed
        // obj2.on();

        Phone obj3 = new SmartPhone(); //--> Yes This is allowed
        // SmartPhone obj4 = new Phone(); //This is not allowed

        obj3.on();
        obj3.showTime();
        // obj3.music();//-->This is not allowed

    }
}