public class PriorityQueue {
    static final int Max = 6;
    static int arr[] = new int[Max];
    static int count = 0;

    static boolean isfull() {
        return count == Max;
    }

    static boolean isempty() {
        return count == 0;
    }

    static int size() {
        return count;
    }

    static int peek() {
        return arr[count - 1];
    }

    static void insert(int data) {
        int i;
        if (!isfull()) {
            if (count == 0) {
                arr[count++] = data;
            } else {
                for (i = count - 1; i >= 0; i--) {
                    if (data > arr[i]) {
                        arr[i + 1] = arr[i];
                    } else {
                        break;
                    }

                }
                arr[i + 1] = data;
                count++;
            }
        }
    }

    static int delete() {
        return arr[--count];
    }

    public static void main(String[] args) {
        insert(3); // [3]
        insert(5); // [5, 3]
        insert(9); // [9, 5, 3]
        insert(1); // [9, 5, 3, 1]
        insert(12); // [12, 9, 5, 3, 1]
        insert(15); // [15, 12, 9, 5, 3, 1]
        if (isfull()) {
            System.out.println("full");
        }
        int num = delete();
        System.out.println(num);
        insert(16); // [16, 15, 12, 9, 5, 3]
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }

        // Try inserting 17 and 18 (should not be inserted)
        insert(17);
        insert(18);

        System.out.println("Element at front: " + peek());
        while (!isempty()) {

            int n = delete();
            System.out.print(n + " ");

        }

    }

}
