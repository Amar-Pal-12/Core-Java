package Inheritance;

public class car extends Vehicle {

   public int noOfDoors;

   public String transmissionType;

   car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType){
       super(name, model, noOfTyres);
       this.noOfDoors = noOfDoors;
       this.transmissionType= transmissionType;

   }
    public void startAC() {
        System.out.println(" Ac Started of  "+ name);
    }

}

