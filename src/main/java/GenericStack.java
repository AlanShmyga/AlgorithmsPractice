public class GenericStack<T> {

    private Node<T> first;

    public boolean isEmpty() {
        return first == null;
    }

    public void push(T value) {
        if(this.isEmpty()) {
            first = new Node<T>();
            first.item = value;
            System.out.println("True");
        } else {
            Node oldFirst = first;
            Node newFirst = new Node();
            newFirst.previous = oldFirst;
            newFirst.item = value;
            System.out.println("ELSE");
        }
        System.out.println("Added: " + first.item);
    }

    public T pop() {
        T result = null;
        if(this.isEmpty()) {
            System.out.println("STACK IS EMPTY");
        } else {
            result = first.item;
            first = first.previous;
        }

        return result;
    }

    private class Node<T> {
        Node previous;
        T item;
    }

}
