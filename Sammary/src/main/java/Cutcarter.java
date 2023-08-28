import java.util.Scanner;

public class Cutcarter { //class
    public static void main(String[] args) { //method main
        // Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
        ////Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
        ////Например: ввод - mama, papa
        ////вывод - mapa
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vvedite pervoe slovo");
        String firstWord = scanner.nextLine();
        System.out.println("Vvedite vtoroe slovo");
        String secondWord = scanner.nextLine();

        //kak proveritj na chotnostj slovo
        if (firstWord.length() % 2 !=0) {
            System.out.println("Pervoe vvedennoe slovo ne chotnoe");//dlina stroki i esli chotnoe  delim na 2
        } else if (secondWord.length() % 2 != 0) {
            System.err.println("Vtoroe vvedennoe slovo ne chotnoe"); //krasnij cvet budet v console
        } else {
            System.out.println(
                    cutToWordInHalfAndMerge(firstWord, secondWord)
            );
        }
    }

    public static String cutToWordInHalfAndMerge(String firstWord, String secondWord) {
        String firstHalf = firstWord.substring(0,firstWord.length()/2); //substring razrezaet slovo. 0 pozvoljaet obrezatj pervuju chastj
        String secondHalf = secondWord.substring(secondWord.length()/2);

        return firstWord +secondWord;
    }

}
