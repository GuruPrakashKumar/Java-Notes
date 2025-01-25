class MyThread1 extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("thread 1 is running");
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("thread 2 is running");
        }
    }
}

class Thread1 implements Runnable{
    public void run(){//abstract method that needs to be implemented
        for (int i = 0; i < 200; i++) {
            System.out.println("t1 is running");
        }
    }
}
class Thread2 implements Runnable{
    public void run(){
        for (int i = 0; i < 200; i++) {
            System.out.println("t2 is running");
        }
    }
}
public class multithreading {
    
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();
        MyThread2 t2 = new MyThread2();
        t2.start();

        // Thread t3 = new Thread(new Thread1());
        // Thread t4 = new Thread(new Thread2());
        // t3.start();
        // t4.start();

    }
}
