class Node {
    int data;
    Node next;  

    public Node(int data) {
        this.data = data; 
        this.next = null; 
    }
}

public class LinkedList { 
    Node head, tail;
    int size;

    // Constructor to initialize the linked list
    public LinkedList() {
        head = tail = null;
        size = 0;
    }

    // Method to add a node to the linked list
    public void add(int d) {
        Node n = new Node(d); // Create a new node with the given data
        if (head == null) {
            head = tail = n; // If the list is empty, both head and tail point to the new node
        } else {
            tail.next = n; // Link the current tail to the new node
            tail = n;       // Update the tail to point to the new node
        }
        size++; // Increase size
    }

    // Recursive method to print the linked list
    public void printList(Node current) {
        if (current == null) {
            return; // Base case: if current is null, stop the recursion
        }
        System.out.print(current.data + " "); // Print the current node's data
        printList(current.next); // Recursive call to print the next node
    }

    public static void main(String[] args) {
        // Create a new LinkedList
        LinkedList list = new LinkedList();

        // Add nodes to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // Print the linked list starting from the head node using recursion
        list.printList(list.head); // Output: 1 2 3 4

        // Print the size of the linked list
        System.out.println("\nSize of the linked list: " + list.size); // Output: Size of the linked list: 4
    }
}
