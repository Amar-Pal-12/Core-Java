package Encapsulation;

public class Student {
   // Attributes
    private int id;
    private int age;
    private String name;
//    private int nos;
    private String gf;

    public String getGf() {
        return this.gf;
    }

    public int getId() {
        return this.id;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int a){
        // extra layer of authetication
        if(age < 100)
            this.age=a;
           return;
    }

    public String getName(){
        return this.name;
    }


//    public int nos(){
//        return nos;
//    }






    // default constructor
//    public Student(){
//        System.out.println("Student default Constructor called");
//    }

    // Parameterized Constructor
    public Student(int id, int age, String name, String gf) {
        System.out.println(" Student Parameterized Constructor called");
        this.id= id;
        this.name = name;
        this.age= age;
//        this.nos= nos;
        this.gf= gf;

    }
        // copy Constructor
//    public Student(Student newobj) {
//            System.out.println(" Student Copy Constructor called");
//            this.id = newobj.id;
//            this.name = newobj.name;
//            this.age = newobj.age;
//            this.nos = newobj.nos;
//        }

        // methods / behaviours
        public void study () {
            System.out.println(name + " is studying");
        }

        public void sleep () {
            System.out.println(name + " is sleeping");
        }

        public void bunk () {
            System.out.println(name + " is bunking");
        }

       public void gfChatting() {
        System.out.println(name + " is Chatting");
        }

}


