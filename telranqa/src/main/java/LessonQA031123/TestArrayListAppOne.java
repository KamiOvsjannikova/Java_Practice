package LessonQA031123;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayListAppOne {
    public static void main(String[] args) {
        //object class array list
        ArrayList<String> stringList = new ArrayList<>();//spisok strok, u ArrayList est roditelj List
        List<String> list = new ArrayList<>(); //mozet bitj takaja nadpist, budem chawe videtj etu zapisj koda
        //new ArrayList<>(); 10 peremennix xranit
       // list = new LinkedList<>(); //pererisvoit mozno

        //List - O inexed
        //method add - dobavitj element to List to end of the list - dobovlaet v konec spiska
        //1variant -  ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello"); // startovij index 0, on stoit na 0 meste

        //2 variant List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World"); //budet na jachejki 1, t/e/ index sdvigaetsja na edinicu
        list.add("Again"); // ja mogu tolko 10 dobavitj, 11 ne smogu, to nuzno uvelecitj massiv, avtomatom, mi eto ne videm
        //spisok v console
        System.out.println(list);

        // dobavl po indexu element (add element to list by index
        list.add(0,"Hi!"); // sdvinet vse elementi vpravo na 1 - to est Hi budet na 1 meste - budet Hi!Hello, Word
        System.out.println(list);
        list.add(2, "Unique");// budet Hi!, Hello, Unique
        System.out.println(list);
        //vzjatie elementa po index pri pomowi get (get element by index)
        String s = list.get(1);
        System.out.println("Element s - = " + s); // pojavlajetsja Hello
        //zamenit znachenie tekuwego elementa (set(index, element) - replace old element by new in index)
        list.set(1,"Welcome"); //Hello zameneno na Welcome
        System.out.println(list);
        //(remove - delete element by index) udalitj iz spiska, pri udalenii s seredina massiva sdvin na 1 ed vlevo
        list.remove(1);
        System.out.println(list);

        //size() - get size of list )obxod nawego spiska elementov - tut budut otobrazatsja index
        for(int i = 0; i < list.size(); i++) {
            //String element = list.get(i);
            System.out.println("Element by index " + i + " = " + list.get(i)); // i - eto element nomer 0 ili 1, 2,3
        }

        System.out.println("Iterate by foreach : ");
        for(String element : list) { //tut index ne budet otobrazatsja
            System.out.println("Element  = " + element);
        }



    }
}
