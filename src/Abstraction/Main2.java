package Abstraction;

  interface bird{

     void fly();

     void eat();
  }

  class sparrow implements bird{


    @Override
    public void fly() {
        System.out.println("Crow flying");

    }

    @Override
    public void eat() {
        System.out.println("Crow flying");
    }
  }

 class crow implements bird{


    @Override
    public void fly() {
        System.out.println("Crow flying");

    }

    @Override
    public void eat() {
        System.out.println("Crow flying");
    }
 }



 public class Main2 {
    public static void doBirdStuff(bird b){
        b.eat();
        b.fly();
    }

    public static void main(String[] args) {
        doBirdStuff(new sparrow());
        doBirdStuff( new sparrow());
    }



 }
