public class ShellSort {
    public static void main(String[] args) {
        int[] arr = { 33, 45, 62, 12, 98 }; // The array to sort
        int n = arr.length;
        for (int gap = n / 2; gap >= 1; gap = gap / 2) {
            for (int j = gap; j < n; j++) {
                for (int i = j - gap; i >= 0; i = i - gap) {
                    if (arr[i + gap] > arr[i]) {
                        break;
                    } else {
                        int temp = arr[i + gap];
                        arr[i + gap] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
        for (int val : arr) {
            System.out.print(val + " ");
        }

    }

}
