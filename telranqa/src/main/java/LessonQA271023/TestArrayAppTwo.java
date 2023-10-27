package LessonQA271023;

public class TestArrayAppTwo {
    public static void main(String[] args) {
        int [] one = {1,2,3};
        int [] two = {2,3,4};
        int [] three = {3,4,5};
        //dvumernij massiv (mnogomernij)
        int[][] array = new int[3][3];
        array[0] = one; // v element prisvajevaem massiv one
        array[1] = two;
        array[2]= three;

        System.out.println(array[0][2]); //{1,2,3};
        int[][] arrayTwo = {one, two, three};
        int [] [] arrayThree = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i = 0; i < arrayThree.length; i++) {
            int[] value = arrayThree[i];
            for(int j = 0; j <value.length; i++) {
                System.out.println("  " + value[j]);
            }
            System.out.println();
        }

        System.out.println();
        int [] [] arrayFour = {{1,2,3,4},{4,5,},{7,8,9,6,7,8}};
        for(int i = 0; i < arrayFour.length; i++) {
            int[] value = arrayFour[i];
            for(int j = 0; j <value.length; i++) {
                System.out.println("  " + value[j]);
            }
            System.out.println();
        }
    }
}
