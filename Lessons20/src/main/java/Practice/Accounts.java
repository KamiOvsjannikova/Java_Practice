package Practice;

public class Accounts {
    static boolean isValidAccountNumber(String accountNumber) {
        if(accountNumber == null || accountNumber.isEmpty()) //eslo 0 ili pustoj, to false
            return false;

        if(accountNumber.length() != 14)
            return false;

        if(accountNumber.equals("00000000000000"))
            return false;

        return true;
    }
}
