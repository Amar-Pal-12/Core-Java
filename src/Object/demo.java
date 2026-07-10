package Object;

// Call by value

public class demo {

    static  void addTen (int x, int Y){
        x= x+10;
        Y= Y+10;
    }

    public static void main(String[] args) {
        int X= 4;
        int Y= 5;

        System.out.println( X + " , " +Y);

        addTen(X,Y);

        System.out.println(X+ " , " +Y);
    }
}
