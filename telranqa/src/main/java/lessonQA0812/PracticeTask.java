package lessonQA0812;

import java.util.Stack;

public class PracticeTask {
    public static void main(String[] args) {
       // String source = "azzabcddc";
        //sokraritj i ubratj dublir elementov rjadom
        // aabcc --> b
        // Space complexity O(1) -- etot vigodnee dewevle dlja pamatji
        //primeri kak projti
//        for (int i = 0; i < source.length(); i++) { // k vnutren massivu obrawaemsja
//            char c = source.charAt(i);
//        } // dlja algoritmov na sobese ispilzovatj

//        //Space complexity O(N)
//        char[] chars = source.toCharArray();// novij massiv v pamatjati kopiruet
//        for (int i = 0; i < chars.length; i++) {
//            char c = chars[i];
//        } // ego ispolzuejut dla perestavlenija elementov


        String source = "azzabcddc";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < source.length(); i++) { // k vnutren massivu obrawaemsja
            char c = source.charAt(i);
            if (stack.isEmpty()) {
                stack.push(c);// esli pust, to pomewaem c element
                continue;
            }
            //esli uze est elementi v stack
            char temp = stack.peek(); // vozvem element no ne udalim ego
            if (temp == c) { //esli oni =, to udalim
                stack.pop();
            } else {
                stack.push(c); // esli ne =, to dobavim
            }
        }
        System.out.println(stack);
    }
}
