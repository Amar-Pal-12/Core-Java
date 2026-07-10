package Conditionals;

import java.util.Scanner;

public class If_Else_Statement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks:");
        int marks = sc.nextInt();



        if(marks>33){
            System.out.println("you are passed");
        }
        else {
            System.out.println("you failed");
        }


    }
}
