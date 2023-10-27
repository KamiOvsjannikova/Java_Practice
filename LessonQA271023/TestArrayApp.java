package LessonQA271023;

import java.util.Arrays;

public class TestArrayApp {
    public static void main(String[] args) {
        //inicializacija massiva nuzno sadavatj ego razmer
//        reserve name for variable and  init array after it
        int[] ints;
        ints = new int[5];

        int a = ints[2];
        //    reserve name for variable and  init array
        //size of array always "init"type
        int[] intsOne = new int[5]; // objavlenie peremennoj i inicializacija
        //    init array with data
        int[] intTwo = new int[]{ 1,2,3,4,5};
        int[] intThree = {1,2,3,4,5};


        String[] strings = { "One","Two", "Three"};

//        //Create three objects Person and add the in array
        Person[] people = { new Person(), new Person(), new Person()};
        Person personTwo = people[1]; //dopstup k masivu po index

        //vzjatie element po index
        int value = intThree[4];
        intThree[3] = 3;

        //obxod elementov massiv v cikle
        for (int i = 0; i < intThree.length; i++){
            System.out.println("Element by index " + i + " , element = " + intThree[i]);
        }

        // alternative cikla foreach
        for(int val : intThree) {
            System.out.println("Element  = " + val);
        }
        for (String str : strings) {
            System.out.println( "Element of string array = " + str);
        }

        //Arrays - vspomogatelnij class v nem estj mnogo metodov dlja raboti
        //for example toString vozvrawaet predstavlenie massiv kak stroka sam massive ostaetsja v neizmennom vide
        String arrayAsString = Arrays.toString(intThree);
        System.out.println(arrayAsString);


        //metod sort izmenjaet tekuwij massiv
        //QuickSort
        int[] intsFour = { 5,4,7,3,2,9,0};
        System.out.println("Array before sort " +Arrays.toString(intsFour));
        Arrays.sort(intsFour);
        System.out.println("Array after sort "+ Arrays.toString(intsFour));
 }
}
