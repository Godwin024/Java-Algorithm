package validation;

public class PasswordValidation {
    public static boolean isValid(String password) {
        String regexPassword = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[^A-Za-z0-9]).{8,16}";
        return password.matches(regexPassword);
    }
}
