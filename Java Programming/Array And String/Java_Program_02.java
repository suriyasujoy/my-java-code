/* String in java */
// In java, a string is an object that represents a sequence of characters.
// It is instance of the java.lang.String class. 
// String are immutable in java meaning that their values can't be changed after they are created
// Any operation that appears to modify a string actually creates a new string.

import java.util.Scanner;

public class Java_Program_02 {
    public static void main(String[] args) {
        // As String is a class
        // String name = new String("Suriya Das");
        // or
        // String name ="Suriya Das";
        // System.out.println(name);       // output // Suriya Das


        // Take string as a input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");

        // String Name = sc.next();
        // System.out.println("Your string is "+ Name);

        // output
         // Enter String 
         // Suriya Das]
         // Your string is Suriya

        String Name=sc.nextLine();
        System.out.println("Your string is "+ Name);

        // output
        // Enter String 
        // Suriya Das
        // Your string is Suriya Das



        // String Method

        // Name.length();
        // Name.toLowerCase();
        // Name.toUpperCase();
        // String str = Name.replace('r', 'R');
        // return_bool = Name.equals(Another_String)

    }
}
