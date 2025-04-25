// create a convertor class and overload convertTemparature to convert temparature c to f
// and f to c
// same method name but different parameter(number,order, or type of parameters)


import java.util.Scanner;

class Convertor {
    void convertTemparature(double c) {
        double f = ((9 * c) / 5) + 32;
        System.out.println("The result is " + f);
    }
    void convertTemparature(float f) {
        float c = (5 * (f - 32)) / 9;
        System.out.println("The result is " + c);
    }
}

public class Java_Program01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Convertor ob = new Convertor();

        System.out.println("1. c to f 2. f to c");
        System.out.println("Enter your choice");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter c temp::");
                double c = sc.nextDouble();
                ob.convertTemparature(c);
                break;
            case 2:
                System.out.println("Enter f temp::");
                float f=sc.nextFloat();
                ob.convertTemparature(f);
                break;
            default:
                System.out.println("Your choice is not in list");
        }
    }
}