abstract class Functionality{
    abstract void TurnOff();
    abstract void TurnOn();
    void VolUp(){
        System.out.println("Increase volume");
    }
    void VolDown(){
        System.out.println("Decrease volume");
    }
}

// class Remote extends Functionality{
//     @Override
//     void TurnOff(){
//         System.out.println("Turn on the tv");
//     }
// }

// if you define any abstract method and extends into a class 
// then it is nessesery to decalre body of every method

class Remote extends Functionality{
    @Override
    void TurnOff(){
        System.out.println("Turn on the tv");
    }
    @Override
    void TurnOn(){
        System.out.println("Turn off the tv");
    }
}

class HT_Remote extends Functionality{
    void TurnOn(){
        System.out.println("Turn on home theater");
    }
    void TurnOff(){
        System.out.println("Turn off home theater");
    }
}
public class Java_01{
    public static void main(String[] args) {
        Functionality tvob = new Remote();
        tvob.TurnOff();
        Functionality htob = new HT_Remote();
        htob.TurnOn();
        
        tvob.VolDown();
        htob.VolUp();
    }
}

// output
// Turn on the tv
// Turn on home theater
// Decrease volume
// Increase volume