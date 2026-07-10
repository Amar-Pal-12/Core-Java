package Loop;

public class Nested_While_Loop {
    public static void main(String[] args) {
        int i =1;                 //  outer insialized

        while( i <=2){            // outer condition check
            int j=1;              // inner (inisalization)

            while( j <=3){         // innner condition check
                System.out.println("i=" + i + " j=" + j );
                j++;               // inner updation

            }
            i++;                  // outer updation
        }
    }
}
