/*
 * Below are the commonly used constructors of the thread class: 
1. Thread ( ) 
2. Thread ( string ) 
3. Thread ( Runnable r )
4. Thread ( Runnable r, String name ) 
*/

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){//just writing come code randomly under run method
        int i = 34;
        System.out.println("Thank you");
//        while(true){
//            System.out.println("I am a thread");
//        }
    }
}
public class constructorsFromThread {
    public static void main(String[] args) {
    MyThr t1 = new MyThr("guru");
    MyThr t2 = new MyThr("Ram");
    t1.start();
    t2.start();
    System.out.println("The id of the thread t is " + t1.getId());
    System.out.println("The name of the thread t is " + t1.getName());
    System.out.println("The id of the thread t2 is " + t2.getId());
    System.out.println("The name of the thread t2 is " + t2.getName());

    }
}
