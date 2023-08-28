package holder;

import java.util.Scanner;

public class Main14 {

    public static void main(String[] args) {

        System.out.println(SwitchHolder.hold("Security")); // 5 raz vizivaet slovo, chtobi ono zapisalosj v jachejaku
        System.out.println(SwitchHolder.hold("Password"));
        System.out.println(SwitchHolder.hold("User123"));
        System.out.println(SwitchHolder.hold("Piwu svojo"));
        System.out.println(SwitchHolder.hold("1970"));
// Сделайте пожалуйста так, чтобы у нас выводились ВСЕ 10 паролей. А также попробуйте сделать так, чтобы checkName работал со сканером
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter dostup k jachejki: ");
        String[] answer = SwitchHolder.checkName(scanner.nextLine());

   //String[] answer = SwitchHolder.checkName("Andrei");
        int index = 0; // prisvaevajem massiv

        while (true) {
            if (index < answer.length) {
                System.out.println(answer[index]);
                index++;
            } else {
                break;
            }
        }

    }
}
