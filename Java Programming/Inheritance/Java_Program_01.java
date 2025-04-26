// OOPs or object-oriented programing system is a programming approch where code is
// organized into objects containing data and behavior............


// Features of oops

        // 1. Objects
        // 2. Classes
        // 3. Encapsulation
        // 4. Inheritance
        // 5. Polymorphism
        // 6. Abstraction

// Inheritance in java

// Inheritance is the procedure in which one class inherit the
// attributes and methods of another class.

class Parent{
    void Msg1(){
        System.out.println("I am msg 1");
    }
}

class Child extends Parent{     // inherite from parent class 
    void Msg2(){
        System.out.println("I am msg 2");
    }
}

public class Java_Program_01{
    public static void main(String[] args) {
        // creating object of child class

        Child ob = new Child();

        // Now we can invoke Parent class method using object of Child class

        ob.Msg1();
        ob.Msg2();
    }
}

// output
// I am msg 1
// I am msg 2