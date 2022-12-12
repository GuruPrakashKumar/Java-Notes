/*
 1.) Every single thread created in Java has some priority associated with it.
 2.) The programmer can explicitly assign the priority to the thread. Otherwise, JVM automatically assigns priority while creating the thread.
 3.) In Java, we can specify the priority of each thread relative to other threads. Those threads having higher priorities get greater access to the available resources than lower priorities threads.
 4.) Thread scheduler will use priorities while allocating processor.
 5.) The valid range of thread priorities is 1 to 10 (but not 0 to 10), where 1 is the least priority, and 10 is the higher priority.
 6.) If there is more than one thread of the same priority in the queue, then the thread scheduler picks any one of them to execute.
 7.) The following static final integer constants are defined in the Thread class:
    MIN_PRIORITY: Minimum priority that a thread can have. Value is 1.
    NORM_PRIORITY: This is the default priority automatically assigned by JVM to a thread if a programmer does not explicitly set the priority of that thread. Value is 5.
    MAX_PRIORITY: Maximum priority that a thread can have. Value is 10.

*/
class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 34;

        while(i<50000){
//            System.out.println("I am a thread");
            System.out.println("Thank you: " + this.getName());
            i++;
        }

    }
}

public class Threadpriority {
    public static void main(String[] args) {
        // Ready Queue: T1 T2 T3 T4 T5
        MyThr1 t1 = new MyThr1("Harry1");
        MyThr1 t2 = new MyThr1("Harry2");
        MyThr1 t3 = new MyThr1("Harry3");
        MyThr1 t4 = new MyThr1("Harry4");
        MyThr1 t5 = new MyThr1("Harry5 (most Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
