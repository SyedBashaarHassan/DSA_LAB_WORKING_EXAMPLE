class LinkedList {
    private Node front, rear;
    static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public boolean isEmpty() {
        return (front == null);
    }

    public void insertLast(int newData) {
        Node newNode = new Node(newData);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    public void insertFirst(int newData) {
        Node newNode = new Node(newData);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            newNode.next = front;
            front = newNode;
        }
    }
    public int deleteFirst() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1; 
        }
        int temp = front.data;
        front = front.next; 
        if (front == null) {
            rear = null; 
        }
        return temp;
    }
    public int deleteLast() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1; 
        }

        if (front == rear) {
            int temp = front.data;
            front = null;
            rear = null;
            return temp;
        }

        Node current = front;
        while (current.next != rear) {
            current = current.next;
        }
        int temp = rear.data;
        rear = current; 
        rear.next = null; 
        return temp;
    }
    public void displayList() {
        System.out.println("Displaying Elements of DEQ");
        Node current = front;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
class Queue {
    LinkedList llist;

    public Queue() {
        llist = new LinkedList();
    }

    public boolean isEmpty() {
        return llist.isEmpty();
    }

    public void enqueue(int newData) {
        llist.insertLast(newData);
    }

    public int dequeue() {
        return llist.deleteFirst();
    }

    public void printQueue() {
        llist.displayList();
    }
}
class DoubleEndedQueue {
    LinkedList llist;
    public DoubleEndedQueue() {
        llist = new LinkedList();
    }
    public boolean isEmpty() {
        return llist.isEmpty();
    }
    public void enqueueAtRear(int newData) {
        llist.insertLast(newData);
    }
    public void enqueueAtFront(int newData) {
        llist.insertFirst(newData);
    }
    public int dequeueFromFront() {
        return llist.deleteFirst();
    }
    public int dequeueFromRear() {
        return llist.deleteLast();
    }
    public void printQueue() {
        llist.displayList();
    }
}

public class QueueClient {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.printQueue();

        queue.dequeue();
        queue.printQueue();
        DoubleEndedQueue deq = new DoubleEndedQueue();
        deq.enqueueAtRear(12);
        deq.enqueueAtRear(13);
        deq.enqueueAtRear(18);
        deq.printQueue();

        deq.enqueueAtFront(30);
        deq.printQueue();

        int element1 = deq.dequeueFromFront();
        System.out.println("Dequeued element (from front) is " + element1);
        deq.printQueue();

        int element2 = deq.dequeueFromRear();
        System.out.println("Dequeued element (from rear) is " + element2);
        deq.printQueue();
    }
}








































