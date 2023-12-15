package lessonQA1512;

import java.util.HashMap;
import java.util.Map;

public class TestMapExampleOne {
    public static void main(String[] args) {
        String text = "gahahahahah  ajahahhahaah jajajaj ajahajaja ggghshjscjshjs jhjashjhajha jhgajh";
        // s -100,
        // d - 20,
        // k - 35
        //char - character

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i);// vzjali element iz stroki po index
            if (map.containsKey(temp)){ // provereli estli li etot element v map
                Integer value = map.get(temp); // esli estj, to togda berem znachenie dlja etogo elementa
                map.put(temp,value +1);// pomewaem obratno i uvelech. na 1
            } else{
                map.put(temp, 1); // esli v pervie vidim etot element, to pomewaem element so znacheniem 1
            }
        }
        // obxod cikla for
        map.forEach((key, value) ->{
            System.out.println("Symbol " + key + " contains " + value + " times");
        }); // on identichen  for (Map.Entry<Character, Integer> pair : map.entrySet()) {
       // System.out.println("Symbol " + pair.getKey() + " contains " + pair.getValue() + " times");
   // }
    }
}
