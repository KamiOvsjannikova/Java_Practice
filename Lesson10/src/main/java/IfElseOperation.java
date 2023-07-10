import java.util.Random;

public class IfElseOperation {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(200) - 100; // esli pustoe mesto budet otric number, net ogranichenij// interval ot -100..+100
        System.out.println("Number  before checking = " + number);

        if (number > 0) {
            System.out.println("Temperature Celcium " + (number - 273));
        } else {
            System.out.println("Mi ne mozem preobrazovatj number v temperature Celcium");
        }





//alternativa
        if (number > 0) {
            System.out.println("Temperature Celcium " + (number - 273));
        }
        if (number <= 0) { //mozno bilo postavitj ! (!(number>0)) to estj anologichno (number<=0)
            System.out.println("Mi ne mozem preobrazovatj number v temperature Celcium");

        }

        //esli iskluchitj 0 iz proverki
        if (number > 0) {
            System.out.println("Temperature Celcium " + (number - 273));
        }
        if (number < 0) {
            System.out.println("Mi ne mozem preobrazovatj number v temperature Celcium");
        }
        if (number == 0) {
            System.out.println("Znachenie = 0 ");
        }
    }
}
