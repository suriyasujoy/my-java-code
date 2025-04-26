/* Array in Java */
/* Take n integer as a input and calculate sum of this number */

import java.util.Scanner;


public class Java_Program_01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  value of n ::");
        int n = sc.nextInt();
        int sum=0;

        // Array declaration in java

        int []Array = new int[n];

        // int []Array = new int[4]; 

        for(int i=0; i<n;i++){
            System.out.println("Enter "+ i + " number ::");
            Array[i]=sc.nextInt();
            sum += Array[i];
        }

        System.out.println("The sum of "+ n +" is "+sum);
    }
}

// output

// Enter the  value of n ::
// 3
// Enter 0 number ::
// 2
// Enter 1 number ::
// 6
// Enter 2 number ::
// 4
// The sum of 3 is 12