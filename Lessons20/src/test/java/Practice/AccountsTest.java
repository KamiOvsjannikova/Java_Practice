package Practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountsTest {


    @Test
    void isValidAccountNumber_length14() {// chto mi proverjaem
        String badAccountLess14 = "15654646";
        String badAccountMore14 = "7155165654654654";
        assertFalse(Accounts.isValidAccountNumber(badAccountLess14));
        assertFalse(Accounts.isValidAccountNumber(badAccountMore14));
    }

    @Test
    void isValidAccountNumber_allNumberNot0() {// chto mi proverjaem
        String badAccountAll0 = "00000000000000";
        assertFalse(Accounts.isValidAccountNumber(badAccountAll0));
    }
    @Test
    void isValidAccountNumber_notNull_notEmpty() {// chto mi proverjaem
        assertFalse(Accounts.isValidAccountNumber(null));
        assertFalse(Accounts.isValidAccountNumber("")); //pustaja stroka
    }
    @Test
    void isValidAccountNumber_correct() {// chto mi proverjaem
        String goodAccount = "71551656546546";
        assertTrue(Accounts.isValidAccountNumber(goodAccount));
    }
}