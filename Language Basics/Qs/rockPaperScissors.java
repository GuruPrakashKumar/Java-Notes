import java.util.Random;
import java.util.*;

public class rockPaperScissors {
    public static void compare(int computerChoice,int userChoice){
        if (computerChoice==0 && userChoice==0) {
            System.out.println("Tie\n");
        }else if (computerChoice==0 && userChoice==1) {
            System.out.println("You win\n");
        }else if (computerChoice==0 && userChoice==2) {
            System.out.println("You lose\n");
        }else if (computerChoice==1 && userChoice==0) {
            System.out.println("You lose\n");
        }else if (computerChoice==1 && userChoice==1) {
            System.out.println("Tie\n");
        }else if (computerChoice==1 && userChoice==2) {
            System.out.println("You win\n");
        }else if (computerChoice==2 && userChoice==0) {
            System.out.println("You lose\n");
        }else if (computerChoice==2 && userChoice==1) {
            System.out.println("You win\n");
        }else if (computerChoice==2 && userChoice==2) {
            System.out.println("Tie\n");
        }
        return;
    }
    public static void printChoices(int computerChoice, int userChoice){
        if (computerChoice==0) {
            System.out.println("Computer Choice = rock");
        }else if (computerChoice==1) {
            System.out.println("Computer Choice = paper");
        }else if (computerChoice==2) {
            System.out.println("Computer Choice = scissors");
        }
        
        
        if (userChoice==0) {
            System.out.println("user Choice = rock");
        }else if (userChoice==1) {
            System.out.println("user Choice = paper");
        }else if (userChoice==2) {
            System.out.println("user Choice = scissors");
        }
        return;
    }
    public static void main(String[] args) {
        // rock = 0;
        // paper = 1;
        // scissors = 2;

        Random rnd = new Random();
        System.out.println("Hello !!! Welcome to Rock Paper Scissors Game. Enter your Choice and the Computer will choose its choice");
        System.out.println("You can only enter 0 or 1 or 2");
        System.out.println("rock = 0 "+"paper = 1 "+"scissors = 2\n"+"There are 3 rounds. You should win at least 2 rounds to win the series");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int round = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("****ROUND "+(i+1)+"****\n");
            System.out.print("Enter your choice: ");
            int computerChoice = rnd.nextInt(3);
            int userChoice = sc.nextInt();
            
            printChoices(computerChoice, userChoice);
            if (userChoice>2) {
                System.out.println("Enter a valid number.(choose any one of these numbers 0,1,2)");
            }
    
            System.out.println();
            
            compare(computerChoice, userChoice);
            round = round + 1;
            
        }
        
    }
    
}