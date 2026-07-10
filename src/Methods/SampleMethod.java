package Methods;

public class SampleMethod {
          static void  print2kaTable(){
             for(int i =1; i<=10; i++){
                 int ans = 2*i;
                 System.out.println("-> " +ans);

             }
         }
         // with parameter
         static void printSum (int x, int y){
             System.out.println(x+y);

         }
         // without Parameter

         static void printSubtract(){
             System.out.println("hello, Welcome");
         }

         // void --- not return Type needed
         static void PrintMultiplication(int x, int y) {
             System.out.println(x * y);
         }

     // method overloading
    // non-void --- return something

    static int sum(int p, int q){
       int sum = p+q;
       return sum;

    }

    // method overloading

    static int sum(int p, int q, int r){
        int sum1 = p+q+r;
        return sum1;
    }

    public static void main(String[] args) {
         int result = sum(5,10);
        System.out.println("result1 " +result);

        int res = sum(5,6,7);
        System.out.println("result2 "+res);


//        print2kaTable();
//         printSum(3,4);
//         printSubtract();
//         PrintMultiplication(5,10);

    }

}