package stack;

public class Validator {
    //Fields ---------------------------------------------------------------------------------------------------------


    //Constructors ---------------------------------------------------------------------------------------------------


    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------


    //Methods - Other ------------------------------------------------------------------------------------------------
    public boolean validateBrackets(String expression) {
        NodeStack stack = new NodeStack();
        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            } else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
                char stackTop = (char) stack.peek();
                if ((currentChar == ')' && stackTop == '(') || (currentChar == '}' && stackTop == '{') || (currentChar == ']' && stackTop == '[')) {
                  stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

}
