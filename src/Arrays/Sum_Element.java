package Arrays;

import java.util.Scanner;

public class Sum_Element {
    public static void main(String[] args) {

//        int[] arr = {10,20,30,40,50};

        // taking input from user
        System.out.print("Enter size of array: ");
        Scanner sc = new Scanner(System.in); // taking input
         int x= sc.nextInt(); // take user value 4
         int[] arr = new int[x]; // create array size 4
         System.out.print("Enter element: ");


         for(int i=0; i<x; i++){
             arr[i]= sc.nextInt();
         }

         // print
        int sum =0;
         for(int i= 0; i< arr.length; i++){
             sum += arr[i];
         }
        System.out.print(sum);



    }
}
