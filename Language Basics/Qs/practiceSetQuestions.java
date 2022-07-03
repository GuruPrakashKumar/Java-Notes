import java.util.*;

public class practiceSetQuestions {
    public static float percentageCalculator(float a1,float a2,float a3) {
        float percentage = ((a1+a2+a3)*100)/300;
        return percentage;
    }
    
    public static void main(String[] args) {
        /* Q. Write a program to find out whether a student is pass or fail.
        if requirs total 40% and at least 33% in each subject to pass.
        Assume 3 subjects and take marks as an input from the user. */ 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your Maths Marks: ");
        // byte s1 = sc.nextByte();
        // System.out.print("Enter your Physics Marks: ");
        // byte s2 = sc.nextByte();
        // System.out.print("Enter your Chemistry Marks: ");
        // byte s3 = sc.nextByte();

        // if (s1>33 && s2 >33 && s3>33 && percentageCalculator(s1, s2, s3)>40) {
        //     System.out.println("Pass");
        // } else {
        //     System.out.println("fail");
        // }

        // System.out.println("Your total Percentage: "+percentageCalculator(s1, s2, s3));

        // if ((percentageCalculator(s1, s2, s3)/9.5)>=10) {
        //     System.out.println("CGPA = "+10);
        // } else {
        //     System.out.println("CGPA = "+percentageCalculator(s1, s2, s3)/9.5);
        // }


        /* Q. Calculate income for paid by an employee to the government as per the slabs mentioned below:
        income slab     Tax
        2.5L - 5.0L      5% 
        5.0L - 10.0L     20%
        above 10.0L      30% */ 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your income : ");
        // int income = sc.nextInt();
        // if (income<250000) {
        //     System.out.println("No Tax");
        // }else if (income>=250000 && income<500000) {
        //     System.out.println("Tax = "+0.05*income);
        // }else if (income>=50000 && income<1000000) {
        //     System.out.println("Tax = "+0.20*income);
        // }else if (income>=1000000) {
        //     System.out.println("Tax = "+0.30*income);
        // }

        // Q. Create a program which detects leap year.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = sc.nextInt();
        if (year%100==0) {
            if (year%400==0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("This year is not a leap year");
            }
        } else {
            if (year%4==0) {
                System.out.println("Leap year");
            } else {
                System.out.println("This year is not a leap year");   
            }
        }
    }
}