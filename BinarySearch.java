public class BinarySearch {
    static void binarysearch(int a[], int low, int high, int key) {
        int mid = (low + high) / 2;
        if (low <= high) {
            if (a[mid] == key)
                System.out.println("element found at index " + mid);
            else if (key < a[mid])
                binarysearch(a, low, mid - 1, key);
            else if (key > a[mid])
                binarysearch(a, mid + 1, high, key);
        } else if (low > high)
            System.out.println("unsuccessful search");

    }

    public static void main(String[] args) {
        int n, low, high, key;
        n = 5;
        low = 0;
        high = n - 1;
        int a[] = { 1, 2, 3, 4, 5 };
        key = 5;
        binarysearch(a, low, high, key);
        key = 6;
        binarysearch(a, low, high, key);

    }
}
