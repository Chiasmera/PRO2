package deque;

import java.util.NoSuchElementException;

public class CircularArrayDeque implements DequeI{
     //Fields ---------------------------------------------------------------------------------------------------------
    private Object[] deque;
    private int head;
    private int tail;
    private int currentSize;


    //Constructors ---------------------------------------------------------------------------------------------------
    public CircularArrayDeque(int initSize) {
        deque = new Object[initSize];
        this.head = 0;
        this.tail = 1;
        this.currentSize = 0;
    }

    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------
    @Override
    public Object getFirst() {
        return deque[(head + 1) % deque.length];
    }

    @Override
    public Object getLast() {
        return deque[(tail + deque.length-1) % deque.length];
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return currentSize < 1;
    }

    @Override
    public void addFirst(Object element) {
        if (currentSize >= deque.length) {
            throw new IllegalArgumentException("No more space in deque");
        }
        deque[head] = element;
        head = (head + deque.length-1) % deque.length;
        currentSize++;
    }

    @Override
    public void addLast(Object element) {
        if (currentSize >= deque.length) {
            throw new IllegalArgumentException("Nor more space in deque");
        }
        deque[tail] = element;
        tail = (tail + 1) % deque.length;
        currentSize++;
    }

    @Override
    public Object removeFirst() {
        if (currentSize < 1) {
            throw new NoSuchElementException();
        }
        head = (head + 1) % deque.length;
        Object result = deque[head];
        deque[head] = null;
        currentSize--;
        return result;
    }

    @Override
    public Object removeLast() {
        if (currentSize < 1) {
            throw new NoSuchElementException();
        }
        tail = (tail + deque.length-1) % deque.length;
        Object result = deque[tail];
        deque[tail] = null;
                currentSize--;
        return result;
    }
    //Methods - Other ------------------------------------------------------------------------------------------------


}
