package fibonacci;/*
 *
 * @author Lawshiga
 *
 */

public class FasterFibonacci {

    // even if we redo the calculations we aren't saving it somewhere so that we can access it later on
    // so the solution is to save it somewhere
    // this type of strategy in an algorithm is called Memoization: look up the already calculated

    private static long[] fibonacciCache;

    public static void main(String[] args) {
        int n = 50;
        fibonacciCache = new long[n+1];
        for(int i=0; i<=n; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static long fibonacci(int n) {
        if(n <= 1) {
            return n;
        }
        if(fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }

        long nthFibonacciCache = fibonacci(n-1) + fibonacci(n-2);

        fibonacciCache[n] = nthFibonacciCache;

        return nthFibonacciCache;
    }

}

