package sedgewick;

import javax.naming.OperationNotSupportedException;
import java.lang.reflect.Field;
import java.util.Arrays;

public class FixedSizeArrayBasedStack {

    private String[] stack;
    private int coursor;

    public FixedSizeArrayBasedStack(int size) {
        this.stack = new String[size];
        this.coursor = 0;
    }

    public void push(String item) {
        System.out.println("Pushing " + item + " to position " + coursor);
        if (this.coursor < this.stack.length) {
            this.stack[coursor++] = item;
        } else {
            System.out.println("Stack overflow");
        }
    }

    public String pop() {
        if(!this.isEmpty()) {
            System.out.println("Poping "+coursor);
            return this.stack[--coursor];
        } else {
            return "Stack is empty";
        }
    }

    public boolean isEmpty() {
        return coursor == 0;
    }

    public static void main(String[] args) {
        FixedSizeArrayBasedStack stack = new FixedSizeArrayBasedStack(5);
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        stack.push("More");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
