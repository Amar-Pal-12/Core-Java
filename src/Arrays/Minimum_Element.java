package Arrays;

public class Minimum_Element {
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,24,67};
        int min = arr[0];
//        int min = Integer.MAX_VALUE;
        for(int i=0; i< arr.length; i++ ){
        if(arr[i] < min){
            arr[i] = min;

        }

        }
        System.out.println(min);


    }
}
