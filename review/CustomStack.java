class Node {
    Node next;
    int value;

    Node(int val) {
        value = val;
        next = null;
    }
}

class Stack {
    Node top = null;

    public void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }

    public void seek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        Node node = top;
        do {
            System.out.println(node.value);
            node = node.next;
        } while (node != null);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        int removedValue = top.value;
        top = top.next;

        return removedValue;
    }

    public boolean isEmpty() {
      return top == null;
    }
}

public class CustomStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.seek();
    }
}