package queue;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a linked list.
 */
public class NodeQueue implements QueueI {
    private Node head;
    private Node tail;
    private int size;


    /**
     * Constructs an empty queue.
     */
    public NodeQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;

    }

    @Override
    public void enqueue(Object element) {
        Node node = new Node();
        node.data = element;

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

        size++;
    }

    @Override
    public Object dequeue() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        Node dequeuedNode = head;
        head = head.next;
        Object data = dequeuedNode.data;
        dequeuedNode.next = null;
        dequeuedNode.data = null;

        size--;
        return data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size < 1;
    }

    class Node {
        public Object data;
        public Node next;
    }
}
