/* Method inside the main class */

public class Java_Program_01{
    public static void main(String[] args) {
        Massege1(); // we can invoke directly just using name to static method

        // but, to invoke non static method an object is needed 
        Java_Program_01 ob = new Java_Program_01();
        ob.Greet();
        ob.Massege2();
    }

    public void Greet(){
        System.out.println("Good morning !!!");
    }

    public static void Massege1(){
        System.out.println("Hii !! I am msg 1");
    }
    
    
    void Massege2(){
        System.out.println("Hii !! I am msg 1");
    }
}

// output

// Hii !! I am msg 1
// Good morning !!!
// Hii !! I am msg 1