package Arrays;

public class Product_Element {
    public static void main(String[] args) {
        System.out.print("Print the product of given arrays: ");
        int[] arr = {1,3,5,7,60};
        int product =1;
        for (int i=0; i< arr.length; i++ ){
            product *= arr[i];
        }
        System.out.println(product);
    }
}
