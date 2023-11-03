package LessonQA031123;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListFour {
    public static void main(String[] args) {
        // est spisok znachenij i nuzno vidoizmenitj tekuwejee znachenie
        //Дан список значений (строки), перевести все строки в нижний регистр
        List<String> listOne = new ArrayList<>();
        listOne.add("Red");
        listOne.add("Green");
        listOne.add("White");
        listOne.add("Black");
        //krasivij vivod
        System.out.println("Original list = " + listOne);
        //vizov metoda v novoj spisok
        List<String> list = convertToLowerCase(listOne);
        //vivod novogo spiska
        System.out.println("List with strings in lower cas " + list);

        System.out.println("Original list = " + listOne);
        convertToLowerCaseInplace(listOne);
        System.out.println("Original list2 = " + listOne);
    }

    public static List<String> convertToLowerCase(List<String> list) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
//            String oldValue = list.get(i);
//            String newValue = oldValue.toLowerCase();
//            stringList.add(newValue);
//        }
            //objedenie
            stringList.add(list.get(i).toLowerCase());
        }
        return stringList;
    }

    public static void convertToLowerCaseInplace(List<String> list) {
           for (int i =0; i < list.size(); i++) {
              // String oldValue = list.get(i);
              /// String newValue = oldValue.toLowerCase();
               //list.set(i, newValue);
               list.set(i, list.get(i).toLowerCase());
           }
    }
}

