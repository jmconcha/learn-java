public class CustomStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
    }
}

class Stack {
    Node head = null;

    public void push(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
          head = newNode;
        } else {
          head.next = newNode;
          head = newNode;
        }
    }

    public void display() {
        if (isEmpty()) {
          System.out.println("Stack is empty");
        }

        Node node1 = head;
        Node node2 = node1.next;
        // Node node3 = node2.next;

        System.out.println(node1.value);
        System.out.println(node2.value);
        // System.out.println(node3.value);
    }

    // public int pop() {
    //     if (isEmpty()) {
    //         System.out.println("Stack is empty.");
    //         return;
    //     }

    //     int removedValue = 
    // }

    public boolean isEmpty() {
      return head == null;
    }
}

class Node {
    Node next = null;
    int value;

    Node(int val) {
        value = val;
    }
}