package Arrays;

public class Largest_Element {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,45,9};
        int max = arr[0];
//        int max = Integer.MIN_VALUE;
        for(int i= 0; i< arr.length; i++){
           if(arr[i] > max) max=arr[i];

        }
        System.out.println(max);
    }
}
