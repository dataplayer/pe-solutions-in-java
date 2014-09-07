package arraysandstrings;

/**
 * Created by nicflores on 8/25/14.
 */
public class Problem1Point2 {

    public void reverseCSting(int[] x) {
        int len = x.length;
        System.out.println("reversing...");
        for (int i = len-1; i >= 0; i--) {
            System.out.println(x[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Write code to reverse a C-Style String.");
        System.out.println("(C-Sting means that 'abcd' is represented as five chars, including the null char.)");

        int[] cstring = {115,116,114,105,110,103,0};
        Problem1Point2 p1p2 = new Problem1Point2();
        p1p2.reverseCSting(cstring);
    }

}
