package Arrays;

public class PassingArraysToMethod {
    public static void main(String[] args) {
        int[] x = {10, 20, 30, 40};
        System.out.println(x[2]); // Before change -> 30
        change(x);
        System.out.println(x[2]);  // after change -> 99

    }
        public static void change(int[] y){
           y[2]=99;
        }


}
