import java.util.Scanner;

public class WaveTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        // Input
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Wave Traversal (Column-wise)
        for(int j = 0; j < col; j++) {

            if(j % 2 == 0) {
                // Top to Bottom
                for(int i = 0; i < row; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                // Bottom to Top
                for(int i = row - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}

