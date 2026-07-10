package Basics;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {

        // taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();
        double Area = 3.141592 * radius * radius;
        System.out.print("Enter Area: ");
        System.out.println(Area);
    }
}
