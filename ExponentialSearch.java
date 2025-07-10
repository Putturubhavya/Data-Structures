public class ExponentialSearch {// O(logn)
    static int exponentialsearch(int arr[], int n, int key) {
        if (arr[0] == key) {
            return 0;

        }
        int i = 1;
        while (i < n && arr[i] <= key) {
            i *= 2;
        }
        int low = i / 2;
        int high = Math.min(i, n - 1);
        return binarysearch(arr, low, high, key);
    }

    static int binarysearch(int arr[], int low, int high, int key) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        int n = arr.length;
        int key = 70;
        int index = exponentialsearch(arr, n, key);
        if (index >= 0)
            System.out.println("element found at index " + (index + 1));
        else
            System.out.println("element not found");

    }
}
