// import java.util.Stack;

public class MyStack {

    // Stack<Integer> stack = new Stack<>();
    // System.out.println(stack.push(57));
    // System.out.println(stack.push(47));
    // System.out.println(stack.push(37));
    // System.out.println(stack.push(27));
    // System.out.println(stack.push(17));
    // System.out.println(stack.push(7));

    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    final static int MAXSIZE = 10;
    public static int stack[] = new int[MAXSIZE];
    public static int top = -1;

    // check if the stack is empty()
    public static int isempty() {
        if (top == -1) {
            return 1;
        } else {
            return 0;

        }
    }

    public static int isfull() {
        if (top == MAXSIZE) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int peek() {
        return stack[top];
    }

    public static int pop() {
        int data = 0;
        if (isempty() != 1) {
            data = stack[data];
            top = top - 1;
            return data;
        } else {
            System.out.println("stack is empty");
            return data;
        }
    }

    public static void push(int data) {
        if (isfull() != 1) {
            top = top + 1;
            stack[top] = data;
        } else {
            System.out.println("stack is full");
        }
    }

    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        System.out.println(obj.pop());
        System.out.println(obj.peek());
        System.out.println(obj.isempty());
        System.out.println(obj.isfull());

    }

}
