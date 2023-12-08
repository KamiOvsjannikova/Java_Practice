package lessonQA0812;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        //LIFO - last input first output - posledniji priwel, pervij uwel
        Stack<String> stack = new Stack<>(); // stack nasleduetsja ot vector

        //push - add element to stack - prosto sverxu ondix elementov dobovlaet
        // pop metod - get element from stack and remove element from stack - izvlech
        // peek metod - get element from stack, not remove -- pozvoljaet posmotretj element kot. lezit na verwine stack, no ne izvlekatj ego
        //isEmpty metod - check that stack is not empty -  on standartnij - proverjaet ne pustoj li stack
        //search  metod - find element in stack - najti element v stack i vernutj index

        //dobovlaem slova sverxu
        stack.push("I"); // dobovlaet na verx elementov --> etot budet v samom nizu
        stack.push("am");
        stack.push("Kamilla"); // eto budet sejchas na samom verxu
        System.out.println(stack); // [I, am, Kamilla]

        // poluchitj 1ij element
        String elementFromTop = stack.peek();
        System.out.println(elementFromTop); // vividet Kamilla, no ne udalit
        //System.out.println(stack.peek());

        // izvlech iz verwini element
        String topElement = stack.pop();
        System.out.println("Top element "+ topElement); // vernul Kamilla, no udalil i teperj ostalsja tolko am
        System.out.println(stack); // [I, am]

        System.out.println("New top element " + stack.peek()); // New top element am
        topElement = stack.pop();
        System.out.println("Top element "+ topElement); // vernul I
        System.out.println(stack);

        System.out.println("New top element " + stack.peek());
    }
}
