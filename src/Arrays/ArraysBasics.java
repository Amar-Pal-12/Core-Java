package Arrays;

public class ArraysBasics {
    public static void main(String[] args) {
     int[] arr = {10,20,30,40,50,60};
        // indexing
        System.out.println(arr[2]); // access

        // updating element
        arr[2] = 15;
        System.out.println(arr[2]);

        int[] nums = new int [4]; // size of arrays
        nums[0]= 1;
        nums[1]= 2;
        nums[2]= 3;
        nums[3]= 4;
        System.out.println(nums[2]);
    }
}
