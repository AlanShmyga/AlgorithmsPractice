public class Stack {

    private Node first;

    public boolean isEmpty() {
        return first == null;
    }

    public void push(String value) {
        if(isEmpty()) {
            first = new Node();
            first.item = value;
        } else {
            Node second = first;
            first = new Node();
            first.item = value;
            first.next = second;
        }
    }

    public String pop() {
        if(!isEmpty()) {
            String value = first.item;
            first = first.next;
            return value;
        } else {
            return "STACK IS EMPTY";
        }
    }

    private class Node {
        String item;
        Node next;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("two");
        stack.push("beers");
        stack.push("or");
        stack.push("not");
        stack.push("only");
        stack.push("two");

        for(int i = 0; i < 8; i++) {
            System.out.println(stack.pop());
        }
    }
}
