/*
 * Question 1: Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.
 * Question 2: Add a step method in the welcome thread of question 1 to delay its execution for 200ms.
 * Question 3: Demonstrate gerPriority() and setPriority() methods in Java threads.
 * Question 4: How do you get the state of a given thread in Java?
 * Answer 4: getState() method is used to get the state of a given thread in Java.
 * Question 5: How do you get the reference to the current thread in Java?
 * Answer 5: currentThread() method is used to reference the current thread in Java.
*/
class Practice13 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning!");
        }
    }
}
class Practice13b extends Thread{
    public void run(){
//        while(false){
//            try {
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//            System.out.println("Welcome");
//        }
    }
}

public class practiceSetOnThread {
    public static void main(String[] args) {
        Practice13 p1 = new Practice13();
        Practice13b p2 = new Practice13b();
        // p1.setPriority(6);
        // p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
//        p1.start();
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
