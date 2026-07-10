package Abstraction;

 abstract class Bird {

    abstract void fly();

    abstract void eat();

   }

     class Sparrow extends Bird{


        @Override
        void fly() {
            System.out.println("Crow flying");

        }

        @Override
        void eat() {
            System.out.println("Crow flying");
        }
    }

    class Crow extends Bird{

     @Override
    void fly() {
        System.out.println("Sparrow flying");
     }

    @Override
    void eat() {
        System.out.println("Sparrow flying");
    }
  }
   public class Main {
     public static void doBirdStuff(Bird b){
        b.eat();
        b.fly();
     }
     public static void main(String[] args) {
       doBirdStuff(new Sparrow());
       doBirdStuff(new Crow());
    }

 }
