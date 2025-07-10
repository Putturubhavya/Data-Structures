public class InterpolationSearch {// log(log n) complexity
    static int search(int arr[], int data) {
        int lo = 0;
        int hi = arr.length - 1;
        int mid = -1;
        int index = -1;
        int comparisons = 1;
        while (lo <= hi) {
            System.out.println("comparisons " + comparisons);
            System.out.println("lo " + lo + " " + arr[lo]);
            System.out.println("hi " + hi + " " + arr[hi]);
            mid = (lo + ((hi - lo) * (data - arr[lo]))) / (arr[hi] - arr[lo]);
            System.out.println("mid = " + mid);
            if (arr[mid] == data) {
                index = mid;
                break;
            } else {
                if (data < arr[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }

        }
        return index;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int location = search(arr, 2);
        if (location != -1)
            System.out.println("Element found at location: " + (location + 1));
        else
            System.out.println("Element not found.");

    }
}
