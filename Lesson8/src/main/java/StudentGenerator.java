import java.util.Random;


public class StudentGenerator {
    public static void main(String[] args) {
        //Генерим номер студента
        Random random = new Random();
        int numStudent = random.nextInt(25) + 1;
        System.out.println("Номер студента = "+numStudent);
      //Rabota s merodami
        int sumTemp = sumTwoNumbers(numStudent, 5);
        System.out.println("Сумма номера студента = " + sumTemp);
        System.out.println("Поделили студента = " + divideTwoNumber(numStudent, 2));
        System.out.println("Поделили студента cherez Double = " + divideTwoDoubleNumber(numStudent, 2));
        //System.out.println("Поделили студента na 0 = " + divideTwoDoubleNumber(numStudent, 0));
        System.out.println("Поделили студента na 0 = " + numStudent/1);
        //iwem chetnoe/nechotnoe
        findEvenOdd(2);
        findEvenOdd(5);
        findEvenOdd(numStudent);
    }

    static int sumTwoNumbers(int arg1, int arg2) {
        int sumLocal = arg1 + arg2;
        return sumLocal;
    }

    static double divideTwoNumber(int arg1, int arg2){
        double divLocal = (double)arg1 / arg2;
        //System.out.println("Dubug = "+divLocal); // promezut.rezultat dlja poiska owibki
        return divLocal;
    }

    static double divideTwoDoubleNumber(double arg1, int arg2) {
        double divLocal =  arg1 / arg2;
        //System.out.println("Dubug = " + divLocal); // promezut.rezultat dlja poiska owibki
        return divLocal;
    }
    static void findEvenOdd(int arg) {
        if(arg % 2 == 0) {
            System.out.println(arg+" chetnoje");
        }
        else {
            System.out.println(arg+" nechetnoe");
        }
    }
}