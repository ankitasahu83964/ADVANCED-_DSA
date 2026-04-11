public class MissingNumberXOR {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};

        int n = arr.length + 1;

        int xor1 = 0;
        int xor2 = 0;

        // XOR of numbers from 1 to N
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        // XOR of array elements
        for (int num : arr) {
            xor2 ^= num;
        }

        // Missing number
        int missing = xor1 ^ xor2;

        System.out.println("Missing number is: " + missing);
    }
}
