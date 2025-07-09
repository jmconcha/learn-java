class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;

    Stack() {
        top = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
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
        System.out.println("Top element: " + stack.peek());  // 20
        System.out.println("Pop: " + stack.pop());           // 20
        System.out.println("Pop: " + stack.pop());           // 10
        System.out.println("Is empty? " + stack.isEmpty());  // true
    }
}
