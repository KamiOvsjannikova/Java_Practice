import java.util.Scanner;

public class TestFor {
    public static void main(String[] args) {
printWord(5);
        printNumberWithCount(5634, 4); //4 eto skolko cifr
        Scanner scanner = new Scanner(System.in);
        printNumber(scanner.nextInt());
    }
    static void printNumber(int number){
        for (;;) { //vechnij cikl= analog int i=0; i>=0; i++
            System.out.println(number % 10);
            number = number / 10;
            if (number == 0) break; // break zaverwaet prinuditelno cikl/ vihod iz bloka
        }
    }
    static void printNumberWithCount(int number, int count){
        for(int i=0; i < count; i++) {
            System.out.println(number % 10);
            number = number / 10;
        }
    }
    static void printWord(int count) {
        int i;
        for(i = 0; i < count; i++) { // 5<5 false, vixod iz cikla
            System.out.println("Hello World! "+1);
        }
        System.out.println("i = "+1);
    }
}
