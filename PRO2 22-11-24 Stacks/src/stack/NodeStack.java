package stack;

import java.util.NoSuchElementException;

public class NodeStack implements StackI {

    //Fields ---------------------------------------------------------------------------------------------------------
    private int stacksize;
    private Node topNode;


    //Constructors ---------------------------------------------------------------------------------------------------


    //Methods - Other ------------------------------------------------------------------------------------------------
    @Override
    public void push(Object element) {
        if (topNode == null) {
            topNode = new Node(element, null);
            stacksize++;
        } else {
            topNode = new Node(element, topNode);
            stacksize++;
        }
    }

    @Override
    public Object pop() {
        Node poppedNode;
        if (stacksize < 1) {
            throw new NoSuchElementException("No element in the stack!");
        } else {
            poppedNode = topNode;
            topNode = poppedNode.next;
            poppedNode.next = null;
            poppedNode.data = null;
            stacksize--;
        }
        return poppedNode.data;
    }

    @Override
    public Object peek() {
        if (stacksize < 1) {
            throw new NoSuchElementException("No element in the stack!");
        }
        return topNode.data;
    }

    @Override
    public int size() {
        return stacksize;
    }

    @Override
    public boolean isEmpty() {
        Boolean returnValue = false;
        if (stacksize < 1) {
            returnValue = true;
        }
        return returnValue;
    }

    class Node {
        public Object data;
        public Node next;

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node() {

        }

        public void setData(Object element) {
            this.data = element;
        }

        public void setNext(Node nextNode) {
            this.next = nextNode;
        }
    }


}
