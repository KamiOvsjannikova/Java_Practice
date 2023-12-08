package lessonQA0812;

import java.util.Stack;

public class TestStackIterable {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("I"); // dobovlaet na verx elementov --> etot budet v samom nizu
        stack.push("am");
        stack.push("Kamilla"); // eto budet sejchas na samom verxu
        System.out.println(stack); // [I, am, Kamilla]

        //izvlechj vse elementi v pravelnom porjadke
        System.out.println(stack.search("I"));  // 3 index
        System.out.println(stack.search("am"));//2 index
        System.out.println(stack.search("Kamilla"));//1 index on ne budet 0 kak v Array
        //LIFO
        //Kamilla - am - I
        while (!stack.empty()) { // budet rabotatj poka est v stack elementi poka on ne pustoj
           String elementFromTop = stack.pop();
            System.out.println(elementFromTop); // Kamilla am I
        }
//        System.out.println(stack.search("I")); // vernul -1 , potomu chto v wile ispolzovali
//        System.out.println(stack.search("am"));
//        System.out.println(stack.search("Kamilla"));
    }
}
