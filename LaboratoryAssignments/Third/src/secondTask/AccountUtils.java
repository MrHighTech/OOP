package secondTask;

public class AccountUtils {
    private String username;
    private String password;

    public static void accountCheck(String username, String password) {
        if (password.contains(username)) throw new InvalidPasswordException("Cannot contain username");
        else if (!hasTwoDigits(password)) throw new InvalidPasswordException("Minimum two digits needed");
        else if (!hasTwoUpperCaseLetters(password)) throw new InvalidPasswordException("Minimum three capital letters needed");
        else if (password.length() <= 5 || password.length() >= 10) throw new InvalidPasswordException("Must have more than 5 and less than 10 characters");
    }

    private static boolean hasTwoUpperCaseLetters(String password) {
        int counter = 0;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                counter++;
            }
        }

        return counter >= 2;
    }

    public static boolean hasTwoDigits(String password) {
        int counter = 0;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                counter++;
            }
        }

        return counter >= 2;
    }
}
