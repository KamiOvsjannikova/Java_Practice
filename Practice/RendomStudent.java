package Practice;

public class RendomStudent {

    public static void main(String[] args) {
        System.out.println("Сгенерированный номер студента = "+setStudentvalue(25));
    }
    static int setStudentvalue(int studentValue) {
        int max = studentValue;
        int min = 2;
        int randomStudentNumber = (int) (min + Math.random() * ((max-min)+1));
        return randomStudentNumber;
    }
}
