package InterviewQuestions;

public class PasswordValidation {

    public static void main(String[] args) {

        boolean result = passwordValidate("1Adsad.");
        System.out.println(result);

        //second way with Regex
        System.out.println(isPasswordValid("aDd1sad."));


    }

    private static boolean passwordValidate(String pass) {
        char[] chars = pass.toCharArray();
        boolean hasDigit = false,
                hasSpecial = false;


        if (chars.length < 6 || pass.contains(" ")) {
            return false;
        }

        if (pass.toUpperCase().equals(pass) || pass.toLowerCase().equals(pass)) {
            return false;
        }

        for (char ch : chars) {
            if (Character.isDigit(ch)) hasDigit = true;
            if (!Character.isLetterOrDigit(ch)) hasSpecial = true;

        }

        return hasDigit && hasSpecial;
    }

    //Second way
    private static final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&.])[A-Za-z\\d@$!%*?&.]{6,}$";

    public static boolean isPasswordValid(String password) {
        return password.matches(PASSWORD_REGEX);
    }
}



/*
Write a return method that can verify if a password is valid or not. requirements:
Password MUST be at least have 6 characters and should not contain space
Password should at least contain one upper case letter
Password should at least contain one lowercase letter
Password should at least contain one special characters
Password should at least contain a digit
 */
/*
- min 6 char, doesn't contain space,1 (A~Z), 1 a~z, 1 special char, 1 digit

 */


