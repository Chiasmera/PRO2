package stack;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayListStack implements StackI {

    //Fields ---------------------------------------------------------------------------------------------------------
    private ArrayList<Object> stack;


    //Constructors ---------------------------------------------------------------------------------------------------
    public ArrayListStack() {
        stack = new ArrayList<>();
    }

    //Methods - Other ------------------------------------------------------------------------------------------------
    @Override
    public void push(Object element) {
        stack.add(0,element);
    }

    @Override
    public Object pop() {
        if (stack.size() < 1) {
            throw new NoSuchElementException("No element in the stack!");
        }
        Object topStack = stack.get(0);
        stack.remove(0);
        return topStack;
    }

    @Override
    public Object peek() {
        if (stack.size() < 1) {
            throw new NoSuchElementException("No element in the stack!");
        }
        return stack.get(0);
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        Boolean returnValue = false;
        if (stack.size() < 1) {
            returnValue = true;
        }
        return returnValue;
    }


}
