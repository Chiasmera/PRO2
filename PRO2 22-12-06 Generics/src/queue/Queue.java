package queue;

import snacks.Snack;

import java.util.NoSuchElementException;

public class Queue<T> {
    private int currentSize;
    private Node head;
    private Node tail;

    /**
     * Constructs an empty queue.
     */
    public Queue() {
        currentSize = 0;
        head = null;
        tail = null;
    }

    /**
     * Adds an element to the tail of this queue.
     *
     * @param element the element to add
     */
    public void enqueue(T element) {
        currentSize++;
        Node currentNode = new Node();
        currentNode.data = element;

        if (head == null ) {
            head = currentNode;
        }
        if (tail != null) {
            tail.next = currentNode;
        }
        tail = currentNode;
    }

    /**
     * Removes an element from the head of this queue.
     *
     * @return the removed element
     */
    public T dequeue() {
        if (currentSize == 0) {
            throw new NoSuchElementException();
        }
        T removedData = head.data;
        Node removedNode = head;

        head = removedNode.next;
        if (head == null) {
            tail = null;
        }
        removedNode.data = null;
        removedNode.next = null;

        currentSize--;
        return removedData;
    }

    /**
     * The number of elements in this queue.
     *
     * @return the number of elements in this queue
     */
    public int size() {
        return currentSize;
    }

    /**
     * Checks whether this queue is empty.
     *
     * @return true if this queue is empty
     */
    public boolean isEmpty() {
        return currentSize == 0;
    }


    class Node {
        T data = null;
        Node next = null;
    }


}


