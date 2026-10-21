package validation;

public class EmailValidation {
 public static boolean isValid(String email) {
     String regexEmail = "[a-z]\\.[a-z]+@native\\.semicolon\\.africa";
     return email.matches(regexEmail);
 }
}
