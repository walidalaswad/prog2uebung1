import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PasswordValidatorTest {
    @Test
    public void testPasswordTooShort(){
        boolean output = PasswordValidator.checkPassword("123");
        assertFalse(output);
    }

    @Test
    public void testPasswordTooLong(){
        boolean output = PasswordValidator.checkPassword("123456789123456789123456789123456789");
        assertFalse(output);
    }

    @Test
    public void testPasswordValidLength(){
        boolean output = PasswordValidator.checkPassword("1A23Hjafut@!");
        assertTrue(output);
    }

    @Test
    public void testPasswordContainsOnlyUppercase(){
        boolean output = PasswordValidator.checkPassword("ABCDEFGHIJKL");
        assertFalse(output);
    }

    @Test
    public void testPasswordContainsOnlyLowercase(){
        boolean output = PasswordValidator.checkPassword("abcdefghijkl");
        assertFalse(output);
    }

    @Test
    public void testPasswordContainsNoDigits(){
        boolean output = PasswordValidator.checkPassword("ahgkgsdHJZF");
        assertFalse(output);
    }

    @Test
    public void testPasswordContainsDigitsUpperLowerSpecial(){
        boolean output = PasswordValidator.checkPassword("ahgkgsd9H7JZF@");
        assertTrue(output);
    }

    @Test
    public void testPasswordContainsDigitsUpperLowerNoSpecial(){
        boolean output = PasswordValidator.checkPassword("ahgkgsd9H7JZF");
        assertFalse(output);
    }

    @Test
    public void testPasswordContains4DigitsInARow(){
        boolean output = PasswordValidator.checkPassword("ahgkgsd9999H7JZF");
        assertFalse(output);
    }

    @Test
    public void testPasswordContains4DigitsInARow2(){
        boolean output = PasswordValidator.checkPassword("ahg44444kgsd99H7JZF");
        assertFalse(output);
    }

    @Test
    public void testPasswordContains3Digits(){
        boolean output = PasswordValidator.checkPassword("gsadgas256712HJG$");
        assertFalse(output);
    }

    @Test
    public void testPasswordIsPerfect(){
        boolean output = PasswordValidator.checkPassword("ahg44@!kGsd99H7JZF");
        assertTrue(output);
    }

}


