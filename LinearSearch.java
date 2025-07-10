public class LinearSearch {
    static void linearsearch(int n, int a[], int key) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                System.out.println("element found at index " + (i + 1));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("element not found");
        }
    }

    public static void main(String[] args) {
        int n, key, i;
        n = 5;
        int a[] = { 5, 8, 9, 6, 3 };
        key = 3;
        linearsearch(n, a, key);
        key = 2;
        linearsearch(n, a, key);

    }

}
