package Conditionals;

import java.util.Scanner;

public class If_Statement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age of voter: ");
        int age = sc.nextInt();
        if(age > 18){
            System.out.println("you are eligible for vote");
        }

        sc.close();

    }
}
