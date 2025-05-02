// in the interface, it is necessary to every method or data member either public or default not private
// or protected

interface Remote{
    void tvRemote();
    // protected void HmTRemote(); // error
    void HmTRemote();
}
interface Rem{
    void tvRemote();
}
class Equipment implements Remote,Rem{
    public void tvRemote(){
        System.out.println("I am tv remote");
    }
    public void HmTRemote(){
        System.out.println(" I am Home theater remote");
    }
}
// we can define body of a method one time in a class (exceptional for method overloading)
// it is necessary to declare body of every method of the interface
// When overriding the interface method, it is necessary to declare it public.


public class Java_03 {
    public static void main(String[] args) {
        Equipment ob = new Equipment();
        ob.HmTRemote();
        ob.tvRemote();
    }
}


// output
// I am Home theater remote
// I am tv remote