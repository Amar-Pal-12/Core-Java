package Arrays;

import java.util.Scanner;

public class Negative_Number {
    public static void main(String[] args) {
        System.out.print("Enter size of array: ");
        Scanner sc = new Scanner(System.in); // taking input from user
        int n = sc.nextInt();   // suppose user types 4
        int[] arr = new int[n];  // creates array of size 4
        System.out.print("Enter the elements: ");
        // taking user from input
        for(int i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        // print

        for(int i =0; i<n; i++){
            if (arr[i]<0)
                System.out.print(arr[i] +" ");
        }
        sc.close();
    }
}
