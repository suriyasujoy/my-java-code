// real example for use another person code and use this own code


import com.cal.Java_Package_05; // import the code of another person
import java.util.Scanner;

public class Java_Package_06 {
    public static void main(String[] args) {
        Java_Package_05 ob=new Java_Package_05();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ::\n");
        int n=sc.nextInt();
        int result=ob.Fact(n);
        System.out.println("The factorial of 5 is "+ result);

        // output

        // Enter a number ::

        // 3
        // The factorial of 5 is 6
    }
}
