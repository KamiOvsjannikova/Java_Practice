package holder;

public class SwitchHolder {
   // private static String owner = "Andrei";
    private  static String[] saver = new String[10]; // v skobkax eto razmer massiva 10/Pervij index 0, poslednij index 9
    private static int index = 0; //opredel jachejka massiva
    public static boolean hold (String password) { // eto pomestitj v massiv
      //  int[] ints = new int[10];// 8 v pervij index, 9 poslednij
        if (index > (saver.length -1)) {
            return false;
        } else {
            saver[index] = password;
            index++;

            return true;
        }
    }
    public static String[] checkName(String inputName) {
        switch (inputName) {
            case "Andrei": // esli neskolko owner, togda cherez zapjatuju
                return saver;
            case "Bad man" :
                String[] cancel = new String[1]; // String potomu chto checkName u nas string
                cancel[0] = "walk away";
                return cancel;
            default:
                String[] wrong = new String[1];
                wrong[0] = "Denial of access";
                return wrong;
        }
    }
}
