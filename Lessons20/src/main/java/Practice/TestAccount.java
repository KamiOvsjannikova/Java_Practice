package Practice;

public class TestAccount {
    public static void main(String[] args) {
        String badAccount = "325648976464";
        System.out.println("Account = "+ badAccount+" is "+Accounts.isValidAccountNumber(badAccount));

        String goodAccount= "12345698774589";
        System.out.println("Account = "+ goodAccount+" is "+Accounts.isValidAccountNumber(goodAccount));
    }
}
