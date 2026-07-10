package Inheritance;

public class Main {
    public static void main(String[] args) {
//        car c = new car ("Maruti", "800", 4, 5,"automatic" );
//        c.startEngine();
//        c.startAC();
//        c.StopEngine();


        MotorCycle m = new MotorCycle("Splender", "XlINE", 2, "U", "soft");
        m.startEngine();
        m.wheelie();
        m.StopEngine();
    }
}
