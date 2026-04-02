import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int row = sc.nextInt();
        int col = sc.nextInt();

        int [][] arr = new int[row][col];
        //input
        for(int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //print array
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //total sum
        int sum =0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum += arr[i][j];
            }
        }
        System.out.println( "Total sum: " +sum);
        //max element
        int max = arr[0][0];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               if(arr[i][j] > max){
                   max = arr[i][j];
               }
            }       
        }
        System.out.println("max: " +max);
        //row wise sum
        for(int i=0;i<row;i++){
            int rowSum = 0;   
            for(int j=0;j<col;j++){
                rowSum += arr[i][j];
            }    
            System.out.println("Row " +i + " sum: " + rowSum);
        }
        //col wise sum
        for(int j=0;j<col;j++){
            int colSum = 0;
            for(int i=0;i<row;i++){
                colSum += arr[i][j];
            }
            System.out.println("column " +j + " sum: " +colSum);
        }
        //matrix multiplication
        System.out.println("Enter columns of second matrix:");
        int c2 = sc.nextInt();

        int[][] b = new int[col][c2];   // second matrix

        System.out.println("Enter elements of second matrix:");
        for(int i=0;i<col;i++){
            for(int j=0;j<c2;j++){
                b[i][j] = sc.nextInt();
            }
        }
// result matrix
        int[][] result = new int[row][c2];

// multiplication logic
        for(int i=0;i<row;i++){
           for(int j=0;j<c2;j++){
               for(int k=0;k<col;k++){
                   result[i][j] += arr[i][k] * b[k][j];
                }
            }
        }

// print result
       System.out.println("Multiplication Result:");
       for(int i=0;i<row;i++){
           for(int j=0;j<c2;j++){
       System.out.print(result[i][j] + " ");
        }
       System.out.println();
    }
       

        //matrix transpose
        System.out.println("Transpose matrix:");
        int [][] arr1 = new int [row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
//print transpose
        int[][] arr2 = new int [col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr2[j][i]=arr1[i][j];
            }
        }
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(arr2[i][j]+" ");
            }
        }
        //digonal element
        for(int i=0;i<row;i++){
            System.out.print(arr1[i][i]+ " ");
        }
    } 
}
    