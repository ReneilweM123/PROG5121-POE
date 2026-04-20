import java.util.Scanner;

public class UserValidation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 1. Username validation
        System.out.print("Enter username: ");
        String username = input.nextLine();
        System.out.println(checkUsername(username));
        
        // 2. Password validation
        System.out.print("Enter password: ");
        String password = input.nextLine();
        System.out.println(checkPasswordComplexity(password));
        
        // 3. Cell phone validation
        System.out.print("Enter cell number with international code: ");
        String cellNumber = input.nextLine();
        System.out.println(checkCellNumber(cellNumber));
        
        input.close();
    }
    
    // Username: contains underscore and no more than 5 characters
    public static String checkUsername(String username) {
        if (username.contains("_") && username.length() <= 5) {
            return "Username successfully captured.";
        } else {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }
    }
    
    // Password: >=8 chars, capital, number, special character
    public static String checkPasswordComplexity(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+=<>?/{}~|-]).{8,}$";
        if (password.matches(regex)) {
            return "Password successfully captured.";
        } else {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
    }
    
    // Cell phone: international code + number no more than 10 chars
    public static String checkCellNumber(String cellNumber) {
        String regex = "^\\+[0-9]{1,3}[0-9]{1,10}$";
        if (cellNumber.matches(regex)) {
            return "Cell phone number successfully added.";
        } else {
            return "Cell phone number incorrectly formatted or does not contain international code.";
        }
    }
}