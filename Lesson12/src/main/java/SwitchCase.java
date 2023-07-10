import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number day of week = ");
        String outNameDay = getNameDayOfWeekIfElse(scanner.nextInt()); //vizov method
        System.out.println("Name of day = " + outNameDay);

        System.out.print("\nEnter number day of week = ");
        outNameDay = getNameDayOfWeekSwitchCase(scanner.nextInt()); //vizov method switch i string ubiraem potomu cto obrawaemsja k nej
        System.out.println("Name of day = " + outNameDay);
    }
    //metod if else if
    static String getNameDayOfWeekIfElse(int dayOfWeek) { //eto Method
        if (dayOfWeek <= 0 || dayOfWeek > 7) {
            System.out.println("Nekorrektnoe vxodjawee chislo! - " + dayOfWeek);
            return "Day nedeli dolzen bitj ot 1...7";
        }
        String nameDayOfWeek = "";
        if (dayOfWeek == 1) nameDayOfWeek = "Monday";
        else if (dayOfWeek == 2) nameDayOfWeek = "Thusday";
        else if (dayOfWeek == 3) nameDayOfWeek = "Wednesday";
        else if (dayOfWeek == 4) nameDayOfWeek = "Thursday";
        else if (dayOfWeek == 5) nameDayOfWeek = "Friday";
        else if (dayOfWeek == 6) nameDayOfWeek = "Saturday";
        else if (dayOfWeek == 7) nameDayOfWeek = "Sunday";
        else nameDayOfWeek = "Nekorrektnoe chislo";

        return nameDayOfWeek;
    }

    static String getNameDayOfWeekSwitchCase(int dayOfWeek) {
        if (dayOfWeek <= 0 || dayOfWeek > 7) {
            System.out.println("Nekorrektnoe vxodjawee chislo! - " + dayOfWeek);
            return "Day nedeli dolzen bitj ot 1...7";
        }
        String nameDayOfWeek = "";
        switch (dayOfWeek) {
            case 1: {
                nameDayOfWeek="Monday";
                break; // on vihodit polnostju iz nawe Switch.Dalnejwee ne proverjat
            }
            case 2: {
                nameDayOfWeek="Thusday";
                break;
            }
            case 3: {
                nameDayOfWeek="Wednesday";
                break;
            }
            case 4: {
                nameDayOfWeek="Thursday";
                break;
            }
            case 5: {
                nameDayOfWeek="Friday";
                break;
            }
            case 6: {
                nameDayOfWeek="Saturday";
                break;
            }
            case 7: {
                nameDayOfWeek="Sunday";
                break;
            }
            default: nameDayOfWeek = "Nekorrektnoe chislo";
        }
        return nameDayOfWeek; //vivod resultat
    }
}

