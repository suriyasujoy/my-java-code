/* Method in the another main class */

class Massege{
    static void Msg1(){ // static method 
        System.out.println("I am msg 1");   
    }
    void Msg2(){    // non static method
        System.out.println("I am msg 2");
    }
}

public class Java_Program_02 {
    public static void main(String[] args) {
        Massege.Msg1(); // We can invoke direcly using the class name to a static method 
        // do not want any object for a static method

        // But to invoke a non static method we need object

        Massege ob = new Massege();
        ob.Msg1();
        ob.Msg2();
    }
}


// output

// I am msg 1
// I am msg 1
// I am msg 2