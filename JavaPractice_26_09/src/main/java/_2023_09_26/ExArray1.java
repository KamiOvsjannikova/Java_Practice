package _2023_09_26;

import java.util.Arrays;

public class ExArray1 {
    public static void main(String[] args) {
        int[] arr = {3, 21, 45, 67, 89, 6, 5, 1}; //massiv chisel
        System.out.println(Arrays.toString(arr));
//summa chisel vsex massiva
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { //prebiraem naw massiv
            /// summa vsex chotnix i nechotnix
            //nechotnie
            if (arr[i] %2 == 0) {
                sum = sum + arr[i];
            };
        }
        //arr[] // esli k konkr chislu, to snachala obrawaemsja k arr i potom opredel chislu
        //Object[] objects // nelzja raznie objecti zasunutj

        //for (int i = 0; i < arr.length; i+=2)
    }
    //schitali summu massiva, no drujoj princip -metod na vstrechu drug drugu
    private static int getSum(Integer[] arr) { // private ispolzuetsja tolko tut ni gde bolwe
        int start = 0;
        int end = arr.length -1;
        int sum = 0;
        while (start < end) {
            sum = sum + arr[start] + arr [end];
            start++;
            end--;
        }
        return sum;
    }
}
