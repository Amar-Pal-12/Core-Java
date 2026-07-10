package Basics;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args){

        System.out.print("calculate the Simple Interest: ");

        Scanner sc = new Scanner(System.in);
        double Principal = sc.nextDouble();
        double Rate = sc.nextDouble();
        double Time = sc.nextDouble();

        double SimpleInterest = (Principal*Rate*Time) / 100;
        System.out.println("Simple Interest = " + SimpleInterest);




    }


}
