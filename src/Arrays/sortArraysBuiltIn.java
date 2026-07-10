package Arrays;
import java.util.Arrays;
public class sortArraysBuiltIn {
    public static void main(String[] args) {
        int[] arr = {40, 50, 10, 20, 90, -10, 1};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
        public static void print(int[] arr){
            for(int i=0; i< arr.length;i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }


    }

