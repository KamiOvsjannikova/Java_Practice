package Practice;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in grad Celcium = " );
        int tempNumber = scanner.nextInt();
        System.out.println("Temperature in Celcium = "+runKelvinConverter(tempNumber));
        System.out.println("Temperature in Fahrenheit = "+runFahrenheitConverter(tempNumber));
    }
     static double runKelvinConverter(double baseValue) {
        return baseValue+273;
     }
     static double runFahrenheitConverter(double baseValue) {
        return 1.8 * baseValue + 32;
     }
}
