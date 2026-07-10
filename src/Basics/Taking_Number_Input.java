package Basics;

import java.math.BigInteger;
import java.util.Scanner;

public class Taking_Number_Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
          int FirstNum = sc.nextInt();

        System.out.println("Enter Second Number:");
           int SecondNum = sc.nextInt();

           int ans = FirstNum + SecondNum;
        System.out.println("Ans will be: " + ans);

        System.out.println("Enter BigInteger Number:");
        BigInteger bg = sc.nextBigInteger();
        System.out.println("BigInteger: " +bg);

        System.out.println("Enter FloatNumber Number:");
         float FloatNumber = sc.nextFloat();
        System.out.println("Float number: " +FloatNumber);

        System.out.println("Enter boolean :");
        boolean flag = sc.nextBoolean();
        System.out.println("flag is:" +flag);

        sc.close();

    }
}
