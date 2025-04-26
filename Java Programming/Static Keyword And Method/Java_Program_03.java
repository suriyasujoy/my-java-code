/* Recursion Function */
import java.util.Scanner;

class Recursion_Function{
    int GCD(int a,int b){
        if(b==0)
            return a;
        else
            return GCD(b, a%b);
    }
}

public class Java_Program_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter two number ::");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        // Creating object of Recursion_Fucntion class

        Recursion_Function ob= new Recursion_Function();

        int result=ob.GCD(n1, n2);
        System.out.println("The GCD of " + n1 + " and " + n2 + " is "+result);
    }
}


// output 
// Enter two number ::
// 12
// 18
// The GCD of 12 and 18 is 6