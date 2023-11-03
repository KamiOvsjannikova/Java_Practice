package LessonQA031123;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListAppTwo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        //Integer integer = integerList.get(1);
        //proverka na pustotu spiska -pistoj ili net
        if(integerList.size() > 0) {
            Integer integer = integerList.get(10);
        }
            //method isEmpty() - check size of List
            if(!integerList.isEmpty()) {
                Integer integer = integerList.get(0);
            } // vernet true oder false

        integerList.add(3);
        integerList.add(5);
        integerList.add(2);

        int integer = integerList.get(1); // vernetsja klass obertka
        //while (!integerList.isEmpty()) {

        //}

        //otchistka polnogo spiska
        System.out.println("Size before clear " + integerList.size());
        integerList.clear();
        System.out.println("Size after clear " + integerList.size());

        //proverka soderzitsja li element v spiske (contains - check that element exists)
        integerList.add(3);
        integerList.add(5);
        integerList.add(2);
        boolean contains = integerList.contains(5); // soderzit li 5
        System.out.println("Contains 5 is " + contains);
    }
}
