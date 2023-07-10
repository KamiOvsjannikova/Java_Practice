import java.util.Random;

public class IfElseIfOperation {
    public static void main(String[] args) {
        Random random = new Random();
        float number = random.nextFloat() + random.nextInt(10);
        System.out.println("Nawe sgenerirovannoe chislo = "+number);

        //prostoj if
        if(number>0 && number<2) System.out.println("Nachalsja nebolwoj dozdj");
        if(number>=2 && number<5) System.out.println("Silnij dozdj");
        if(number>=5 && number<7) System.out.println("Na ulice livenj ");
        if(number>=7) System.out.println("Potop! Sidim doma!");

        // alternativa
        if(number>0) System.out.println("Nachalsja nebolwoj dozdj");
        else
            if (number<5) System.out.println("Silnij dozdj");
            else
                if (number<7) System.out.println("Na ulice livenj ");
                else System.out.println("Potop! Sidim doma!");

  //Rabota so strakoj
        isDarkOrLight("red");
        boolean bVal = true;
        if(bVal) System.out.println("Истина");

    }
    static void isDarkOrLight(String color) {
        if(color.equalsIgnoreCase("white")) {
            System.out.println(color + " - light");
        } else if (color.equalsIgnoreCase("black")) {
            System.out.println(color + " - dark");
        }
        else if(color.equalsIgnoreCase("green")) {
            System.out.println(color + " - light");
        } else if (color.equalsIgnoreCase("braun")) {
            System.out.println(color + " - dark");
        }
        else {
            System.out.println(color + " - ne mozem opredelitj ");
        }
    }
}
