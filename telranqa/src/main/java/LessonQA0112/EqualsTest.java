package LessonQA0112;

public class EqualsTest {
    //sravnenie objectov
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        boolean isEquals = a==b;

        int c = 1;
        Integer d =  Integer.valueOf(1);//class obertka
        boolean isEqualsPrimitiveAndReference = c == d;
        System.out.println(isEqualsPrimitiveAndReference);
    }
}
