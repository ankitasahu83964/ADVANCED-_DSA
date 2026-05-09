import java.util.*;
public class PowerRecursion {

    static int power(int base, int exp) {

        // Base case
        if (exp == 0)
            return 1;

        // Recursive call
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {

        int base = 2;
        int exp = 5;

        int result = power(base, exp);

        System.out.println(base + " raised to " + exp + " = " + result);
    }
}