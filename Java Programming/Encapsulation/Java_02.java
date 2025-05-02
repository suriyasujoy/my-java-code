/* get and set concept for encapsulation in java */

class Account{
    private String name;
    private long Ac_No;
    public void setName(String name){
        this.name=name;
    }
    public void set_Ac_No(long Ac_No){
        this.Ac_No=Ac_No;
    }
    public String getName(){
        return name;
    }
    public long get_Ac_No(){
        return Ac_No;
    }
}
public class Java_02 {
    public static void main(String[] args) {
       Account ob = new Account();
       ob.setName("Suriya Das");
       ob.set_Ac_No(5539715);
       System.out.println("Account holder is "+ob.getName());
       System.out.println("His Account number is "+ob.get_Ac_No());
    }
}


// output
// Account holder is Suriya Das
// His Account number is 5539715