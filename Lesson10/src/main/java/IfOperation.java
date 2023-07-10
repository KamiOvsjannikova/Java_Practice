import java.util.Random;

public class IfOperation {
    public static void main(String[] args) {
        Random random = new Random();// net ogranichenij v chislax
        int number = random.nextInt();
        System.out.println("Number before checking = " + number);

        if (number > 0) {
            number++;
        }

        System.out.println("Number before checking = " + number);

        if (number == 0) { // ravno 0
        ++number;//inkriment (--)

        System.out.println("Esli ravno 0 = " + number);// vipolnjaetsja sout tolko kogda uslovie vipolneno
    }

        if(number<0)return; // exit iz programmi, iz metoda main esli chislo -156541654
        System.out.println("Temperature Celcium "+(number-273));
    }
}

