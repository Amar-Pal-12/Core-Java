package Conditionals;

import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[] args) {
//        int dayNumbers = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thrusday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Number");
        }

    }
}
