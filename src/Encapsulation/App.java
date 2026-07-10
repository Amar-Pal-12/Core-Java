package Encapsulation;

public class App {
    public static void main(String[] args) throws Exception{

        // default constructor
//       Student A = new Student();
//       A.id = 1;
//       A.age = 12;
//       A.name = "Anuj";
//       A.nos= 5;
//        System.out.println(A.name);
//        System.out.println(A.id);
//        System.out.println(A.age);
//        System.out.println(A.nos);

       // parameterized Constructor


        Student A = new Student(1,12, "anuj", "Tina");

        System.out.println(A.getAge());
        A.setAge(67);
        System.out.println(A.getAge());
        System.out.println(A.getName());
        System.out.println(A.getId());
        System.out.println(A.getAge());
        System.out.println(A.getGf());


        // Behaviours
        A.study();
        A.bunk();
        A.sleep();
        A.gfChatting();



//        Student B = new Student(A);
//        System.out.println(B.name);
//        System.out.println(B.id);
//       System.out.println(B.age);
//       System.out.println(B.nos);
//
//
//       B.bunk();
//       B.sleep();
//       B.study();






    }
}
