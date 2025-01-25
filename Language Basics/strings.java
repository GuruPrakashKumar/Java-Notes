import java.util.*;

import javax.sound.midi.Synthesizer;

public class strings {
    public static void main(String[] args) {
        // 1)***String declaration***
        
        // String name = "Tony";
        // String fullName = "Tony Stark";
        // String sentence = "My name is Tony Stark";
        int a = 6;
        float b = 5.645f;
        System.out.printf("The value of a is %d and value of is %8.2f",a,b);

        // 2)***How to take input***

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Your name is : "+ name);
        
        // 3)***concatenation***

        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + " " + lastName; 
        /* We can make strings anywhere like the space between firstName and lastName but after execution of this line
        that string will be deleted because it was not stored in any variable. */
        System.out.println(fullName);

        // We can get length of any string --->
        System.out.println( "Length = " + fullName.length() );

        //4)***charAt***  ---> We can print all the characters of any String with this method.

        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        // 5)***Comparing two strings***

        String name1 = "Iron";
        String name2 = "Iron2";

        //1  s1 > s2 : +ve value 
        //2  s1 == s2 : 0
        //3  s1 < s2 : -ve value

        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        // Note : While Comparing two Strings use only compareTo functions instead of ifelse
        // eg :

        // if (name1 == name2) {
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }

        // if (new String("Devil") == new String("Devil")) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");

        // }
        
        // 6)***subString***

        String Sentence = "My name is GuruPrakash";
        String name3 = Sentence.substring(11,Sentence.length());
        String name4 = Sentence.substring(15);
        System.out.println("subString = "+name3);
        System.out.println("subString = "+name4);

        // Note : Strings are immutable

        // 7)***ParseInt Method of Integer class***  <---- To fix

        // String str = '123';
        // int number = Integer.parseInt(str)
        // System.out.println(number);

        // 8)***ToString method of String class***
        int number = 123;
        String str = Integer.toString(number);
        System.out.println(str.length());

        // 9)***lowerCase string and upperCase string method***
        String name5 = "Harry";
        String lString = name5.toLowerCase();
        System.out.println(lString);
        String uString = name5.toUpperCase();
        System.out.println(uString);

        // 10)***Trimmed String***
        String nonTrimmedString = "       Harry         ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());

        // 11)***Replace string method***
        System.out.println(name5.replace('r', 'p'));
        System.out.println(name5.replace("rry", "ppier"));
        System.out.println(name5.replace("r", "ppier"));
        // System.out.println("today" + name5.replace(name5.charAt(0), name5.charAt(1)));

        

        // 12)***Starts with method***
        System.out.println(name5.startsWith("Har"));//-->this method returns only boolean value
        System.out.println(name5.endsWith("Har"));//-->this method returns only boolean value

        //13)***indexOf***
        String tStr = "guruprakash";
        System.out.println("index of up is: "+tStr.indexOf("up"));
        
    }
}
