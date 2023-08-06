import java.util.Arrays;

public class TestingJUnit {
    public static void main(String[] args) {
        int[] arr = Utils.getNumbers();
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);
        int i =10;
        System.out.println(arr[i]);
        int[]arr1 = {};
        System.out.println(arr1.length);
    }
}
