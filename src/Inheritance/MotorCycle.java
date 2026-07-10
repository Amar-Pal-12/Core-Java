package Inheritance;

public class MotorCycle extends Vehicle {
    public String handBarStyle;

    public String suspensionType;

    MotorCycle(String name, String model, int noOfTyres, String handBarStyle, String suspensionType){
        super(name, model, noOfTyres);
        this.handBarStyle = handBarStyle;
        this.suspensionType = suspensionType;
    }

    public void wheelie(){
        System.out.println("MotorCycle is Doing Wheelieee! "+name);
    }
}
