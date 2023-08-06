package Practice0108;

public class MyPracticeStringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" ");
        sb1.append(" world!");
        System.out.println(sb1);

        sb1.insert(6, "beautiful ");
        System.out.println(sb1);
        System.out.println("capacity = "+sb1.capacity());
        System.out.println("lenght = "+sb1.length());


        char[] charBl = new char[9];
        sb1.getChars(6, 15, charBl, 0);
        System.out.println(charBl);
    }
}
