public class JumpSearch { // O(n)
    public static void main(String[] args) {
        int n, key, index, i;
        int[] arr = { 12, 34, 56, 67, 78, 89, 90 };
        System.out.println("array elements are:");
        for (i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + " ");

        }
        n = 12;
        key = 90;
        System.out.println("key: " + key);
        index = jumpsearch(arr, key, n);
        if (index >= 0) {
            System.err.println("element found at index " + (index + 1));
        } else {
            System.out.println("not found");
        }

    }

    static int jumpsearch(int arr[], int key, int n) {
        int i, j, m, k;
        i = 0;
        m = (int) Math.sqrt(n);
        k = m;
        while (arr[m] <= key && m < n) {
            i = m;
            m += k;
            if (m > n - 1) {
                return -1;
            }
            for (j = i; j < m; j++) {
                if (arr[j] == key) {
                    return j;
                }
            }
        }
        return -1;

    }
}
