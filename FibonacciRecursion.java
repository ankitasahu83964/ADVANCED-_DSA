public class FibonacciRecursion {

    static int fibonacci(int n) {
        if (n <= 1) {   // base condition
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // recursive calls
        }
    }

    public static void main(String[] args) {
        int terms = 6;
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
