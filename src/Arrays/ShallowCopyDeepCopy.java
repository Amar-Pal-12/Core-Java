package Arrays;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {

       // ShallowCopy and DeepCopy
        int[] arr ={10,20,30,40};
        int[] x = arr; // x is shallow copy  of arr
        System.out.println(arr[0]); // before
        x[0] =100;
        System.out.println(arr[0]); // after


        int[] y= Arrays.copyOf(arr,arr.length);
        y[0]=100;
        System.out.println(y[0]);
        System.out.println(arr[0]);




    }
}
