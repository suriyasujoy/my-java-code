class Home{
    private int a=1;
    public int b=2;
    protected int c=3;
    int d=4;

    private void Room1(){
        System.out.println("I am private room 1");
    }
    public void Room2(){
        System.out.println("I am public room 2");
    }
    protected void Room3(){
        System.out.println("I am protected room 3");
    }
    void Room4(){
        System.out.println("I am default room 4");
    }
}
public class Java_01 {
    public static void main(String[] args) {
       Home ob = new Home();
    //    ob.Room1();  // can not use private method and data member directly using object
       ob.Room2();
       ob.Room3();
       ob.Room4();

    //    System.out.println("a=%d b=%d c=%d d=%d",ob.a,ob.b,ob.c,ob.d);
       System.out.printf("b=%d c=%d d=%d",ob.b,ob.c,ob.d);
    }
}

// output
// I am public room 2
// I am protected room 3
// I am default room 4
// b=2 c=3 d=4