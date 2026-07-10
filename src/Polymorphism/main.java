package Polymorphism;

public class main {
    public static void main(String[] args) {
//        Calculator c = new Calculator();
//        System.out.println(c.add(3,4));
//        System.out.println(c.add(3,4,5));

         // Runtime Polymorphism
         circle c = new circle();
         doDrawingStuff(c);

         Rect r = new Rect();
         doDrawingStuff(r);


    }

    public static void doDrawingStuff(shape s){
        s.draw();
    }
}
