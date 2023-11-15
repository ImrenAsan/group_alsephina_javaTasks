package week6_codingTasks;

public class passwordValidation_seren {
      /*
    String -- Password Validation Task
    1. Write a return method that can verify if a password is valid or not. requirements:
        1. Password MUST be at least have 6 characters and should not contain space
        2. PassWord should at least contain one upper case letter
        3. PassWord should at least contain one lowercase letter
        4. Password should at least contain one special characters
        5. Password should at least contain a digit
      if all requirements above are met, the method returns true, otherwise returns false
     */

    public static boolean passwordValidation(String password){

        if (password.length() < 6 || password.contains(" ")){
            return false;
        }
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasSpecialCharacter = false;
        boolean hasDigit = false;

        for (char eachChar : password.toCharArray()) {
            if (eachChar >= 'A' && eachChar <= 'Z') {
                hasUppercase = true;
            } else if (eachChar >= 'a' && eachChar <= 'z') {
                hasLowercase = true;
            } else if ((eachChar >= 33 && eachChar <= 47) || (eachChar >= 58 && eachChar <= 64) || (eachChar >= 91 && eachChar <= 96)|| (eachChar >= 123 && eachChar <= 126))  {
                hasSpecialCharacter = true;
            } else if (eachChar >= '0' && eachChar <= '9') {
                hasDigit = true;
            }
        }

        return hasUppercase && hasLowercase && hasSpecialCharacter && hasDigit;

    }

    public static void main(String[] args) {

        String password = "";
        System.out.println(passwordValidation(password));
    }
}
