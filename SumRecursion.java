public class SumRecursion {

    static int sum(int n) {
        if (n == 1) {   // base condition
            return 1;
        }
        return n + sum(n - 1);   // recursive call
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Sum: " + sum(num));
    }
}

