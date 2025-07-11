public class CountingSort {
    public static int[] countsort(int inputarr[]) {
        int n = inputarr.length;
        int m = 0;
        for (int i = 0; i < n; i++) {
            m = Math.max(m, inputarr[i]);
        }
        int countarr[] = new int[m + 1];
        for (int i = 0; i < n; i++) {
            countarr[inputarr[i]]++;

        }
        for (int i = 1; i <= m; i++) {
            countarr[i] += countarr[i - 1];
        }
        int[] outputarr = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            outputarr[countarr[inputarr[i]] - 1] = inputarr[i];
            countarr[inputarr[i]]--;
        }
        return outputarr;

    }

    public static void main(String[] args) {
        int inputarr[] = { 1, 4, 5, 3, 2, 3 };
        int n = inputarr.length;
        int outputarr[] = countsort(inputarr);
        for (int val : outputarr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
