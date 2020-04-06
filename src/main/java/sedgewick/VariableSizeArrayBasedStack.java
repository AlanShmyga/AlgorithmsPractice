package sedgewick;

public class VariableSizeArrayBasedStack {

    private String[] stack;
    private int cursor;

    public VariableSizeArrayBasedStack() {
        this.stack = new String[1];
        this.cursor = 0;
    }

    public void push(String item) {
        System.out.println("Pushing " + item + " to position " + cursor);
        if (this.cursor > this.stack.length * 0.75) {
            String[] newStack = new String[stack.length * 2];
            for (int i = 0; i < this.stack.length; i++) {
                newStack[i] = this.stack[i];
            }
            this.stack = newStack;
        }
        System.out.println("Size = " + this.stack.length);
        this.stack[cursor++] = item;
    }

    public String pop() {
        if(!this.isEmpty()) {
            System.out.println("Poping "+ cursor);
            if (this.cursor < this.stack.length / 2) {
                String[] shrinkedStack = new String[this.stack.length / 2];
                for (int i = 0; i < shrinkedStack.length; i++) {
                    shrinkedStack[i] = this.stack[i];
                }
                this.stack = shrinkedStack;
            }
            System.out.println("Size = " + this.stack.length);
            return this.stack[--cursor];
        } else {
            return "Stack is empty";
        }
    }

    public boolean isEmpty() {
        return cursor == 0;
    }


    public static void main(String[] args) {
    VariableSizeArrayBasedStack stack = new VariableSizeArrayBasedStack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        stack.push("More6");
        stack.push("More7");
        stack.push("More8");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
