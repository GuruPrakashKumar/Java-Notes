import java.util.*;
class StackExample{
    int top = -1;
    int size = 5;
    int arr[];
    public StackExample(int size){
        this.size = size;
        arr = new int[size];
    }
    public void push(int val){
        if(top == size-1){
            System.out.println("overflow");
            return;
        }
        top++;
        arr[top]=val;
        System.out.println("value pushed");
    }
    public int pop(){
        if(top == -1){
            System.out.println("underflow");
            return -404;
        }else{
            int temp = arr[top];
            top--;
            System.out.println("popped element: "+ temp);
            return temp;
        }

    }
    public int peek(){
        return this.arr[this.top];
    }
    public void show(){
        if(top == -1){
            System.out.println("stack empty");
            return;
        }else{
            System.out.print("stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    
}
public class stack1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        StackExample stack = new StackExample(5);
        while (true) {
            System.out.println("1: PUSH");
            System.out.println("2: POP");
            System.out.println("3: PEEK");
            System.out.println("4: SHOW");
            System.out.println("0: exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            if(ch == 1){
                System.out.print("Input Value: ");
                int val = sc.nextInt();

                stack.push(val);
            }else if(ch == 2){
                stack.pop();
            }else if(ch == 3){
                stack.peek();
            }else if(ch == 4){
                stack.show();
            }else if(ch == 0){
                break;
            }
        }
    }
}
