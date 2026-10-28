package validation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidationTest {
    @Test
    public void testValidEmptyPassword() {
        String password = " ";
        assertFalse(PasswordValidation.isValid(password));
    }

    @Test
    public void testInvalidPassword() {
        String password = "davidgodwin02$";
        assertFalse(PasswordValidation.isValid(password));
    }

    @Test
    public void testValidPassword1() {
        String password = "Davidgod123$";
        assertTrue(PasswordValidation.isValid(password));
    }

    @Test
    public void testUperCasePassword() {
        String password = "DAVIDGODWIN123$";
        assertFalse(PasswordValidation.isValid(password));
    }

    @Test
    public void testLowercasePassword() {
        String password = "davidgodwin123$";
        assertFalse(PasswordValidation.isValid(password));

    }

    @Test
    public void testNoSpecialCharactersPassword() {
        String password = "davidgodwin123";
        assertFalse(PasswordValidation.isValid(password));
    }

    @Test
    public void testSpacesCharactersPassword() {
        String password = "davidgod win123";
        assertFalse(PasswordValidation.isValid(password));
    }

    @Test
    public void testNewPassword() {
        String password = "Welcome 123$";
        assertFalse(PasswordValidation.isValid(password));
    }


}
