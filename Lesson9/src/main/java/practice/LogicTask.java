package practice;

public class LogicTask {
    public static void main(String[] args) {
        //False
        int a = 1, b = 2, c = 3, d = 0;
        if ((a < b) && (b == c)) { //1<2 && 2==3 false
            d = a + b + c;
            System.out.println("Summa d = " + d);
        } else {
            System.out.println("False condition!!!");
        }

        //True if
        if ((a < b) || (b == c)) { //1<2 || 2==3 false
            d = a + b + c;
            System.out.println("Summa d = " + d);
        } else {
            System.out.println("False condition!!!");
        }
    }
}