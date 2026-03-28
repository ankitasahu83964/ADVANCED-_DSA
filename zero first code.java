class ZeroFirst {
    public static void zeroFirst(int arr[], int n) {
        int j = n - 1;

        for(int i = n - 1; i >= 0; i--) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 0, 3, 0, 4};

        zeroFirst(arr, arr.length);

        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}