public class BubbleSort {// O(n^2)
    public static void main(String[] args) {
        int n = 5;
        int[] arr = { 34, 23, 56, 45, 20 };
        for (int i = 0; i < n - 1; i++) {
            int swaps = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps = 1;
                }
            }
            if (swaps == 0) {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
