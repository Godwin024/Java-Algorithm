package validation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmailValidationTest {
    @Test
    public void testEmptyEmail() {
        String email = "";
        assertFalse(EmailValidation.isValid(email));
    }

    @Test
    public void testLetters() {
        String email = "david";
        assertFalse(EmailValidation.isValid(email));

    }
    @Test
    public void testEmail() {
        String email ="g.david@native.semicolon.africa";
        assertTrue(EmailValidation.isValid(email));
    }

    @Test
    public void testInvalidEmail() {
        String email = "davidgodwin@gmail.com";
        assertFalse(EmailValidation.isValid(email));
    }

    @Test
    public void testEmailWithNumber(){
        String email = "g.davidgodwin5220@native.semicolon.africa";
        assertFalse(EmailValidation.isValid(email));
    }

    @Test
    public void testInvalidEmailWithTwoLetterStarting(){
        String email = "gd.davidgodwin@native.semicolon.africa";
        assertFalse(EmailValidation.isValid(email));
    }

}
