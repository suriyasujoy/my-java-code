/* Polymorphism in java */
// The word polymorphism means having many forms, 
// and it comes from the Greek words poly (many) and morph (forms)

// this means one entity can take many forms. In Java, polymorphism 
// allows the same method or object to behave differently based on the context

// There are two type of polymorphism 1. Compile time 2. Run time

import java.util.Scanner;

// compile time polymorphism is method overriding

class Addtition {
    public void Add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number ::");
        ;
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("sum of this two number is " + (a + b));
    }

    // to overloading a method it is neccessery to define parameter otherwise it
    // show error
    // public int Add(){
    // Scanner sc =new Scanner(System.in);
    // System.out.println("Enter two number ::");;
    // int a=sc.nextInt();
    // int b=sc.nextInt();
    // return a+b;
    // } // it show an error



    // method overloading


    void Add(int a, int b) {
        System.out.println("sum of this two number is " + (a + b));
    }
}

public class Java_Program02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Addtition ob=new Addtition();
        ob.Add();

        System.out.println("Enter two number ::");;
        int a=sc.nextInt();
        int b=sc.nextInt();
        ob.Add(a,b);
    }

}


// output

// Enter two number ::
// 1
// 9
// sum of this two number is 10
// Enter two number ::
// 8
// 0
// sum of this two number is 8