package fibonacci;/*
 *
 * @author Lawshiga
 *
 */

public class Fibonacci {
    // problem with this algorithm is we keep recalculating the fibonacci number
    // number of calculations it needs to do increases exponentially as the number becomes larger
    public static void main(String[] args) {
        int n = 50; // took so long
        System.out.println(fibonacci(n));
    }

    private static long fibonacci(int n) {
        if(n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
