import java.util.Random;

public class NestedIFOperation {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(200) ; ///interval ot +200
        System.out.println("Genered number = " + number);

        if(number>100) {
            System.out.println("Naruwil pravilo,predupreditj!");
            if (number>130) {
                System.out.println("Zlostno naruwil, vipisan wtraf!");
                if(number>170)  System.out.println("Zabratj prava!");
            }
        }

//ispolzovanie logischeskogo operatora dlja zadanija diapazona
        if(number>100 && number<130) System.out.println("Naruwil pravilo,predupreditj!");
        if(number>130 && number<170) System.out.println("Zlostno naruwil, vipisan wtraf!");
        if(number>170 ) System.out.println("Zabratj prava!");
    }
}
