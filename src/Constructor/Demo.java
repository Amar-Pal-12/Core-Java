package Constructor;

class student {
    String name;
    int age;
    int rollNumber;
    String collage;
}

public class Demo {

    public static void main(String[] args) {

         student s1 = new student();

     // default Values  

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.collage);



    }
}


