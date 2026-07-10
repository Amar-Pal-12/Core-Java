package Arrays;

import java.util.Scanner;

public class LinerSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] num = new int[size];

        // input
        for(int i=0; i<size; i++){
            num[i]= sc.nextInt();  // beginner friendly mistake
        }
        int X = sc.nextInt();

        // output
        for(int i=0; i<size; i++){
            if(num[i] == X){
                System.out.println(" Found the arrays of index: "+i);
            }
        }
        sc.close();

    }
}
