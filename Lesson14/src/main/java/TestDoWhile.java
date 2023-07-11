public class TestDoWhile {
    public static void main(String[] args) {
        runHelloWhile();
        System.out.println();
        runHElloDoWhile();
    }
    static void runHelloWhile() {
        int count=10;
        while (count > 10) { //false dolzno bitj 0. Vipolnenie programmi dalwe ne idet, t.k. 10>10
            System.out.println("Hello programm - "+count);//s scetchik
            count--;
        }
    }

    static void runHElloDoWhile(){
        int count = 10;
        do {
            System.out.println("Hello programm - "+count); //on sanachala vipolnjaet, a potom tolko vnizu proverjaet
            count--;
        } while (count > 10);//false
    }

    static void sum() {
        int i = 10;
        int sum = 0;
        do {
            sum += i;
            i--;
        } while (i >10); //dolzen bitj 0, naprimer esli 55 to bolwe 0. Esli menwe 10, to eto budet beskonechnostj
        System.out.println("Summa = " +sum);
    }
}
