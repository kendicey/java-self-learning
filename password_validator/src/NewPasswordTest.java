import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewPasswordTest {
    
    public static final Scanner input = new Scanner(System.in);
    public static String oldUsername = "johndoe";
    public static String oldPassword = "ABC_1234";

    public static void main(String[] args) {
        printOldInfo();
        String newPassword = getNewPassword();
        while (!hasEightChar(newPassword) || !hasUppercase(newPassword) || !hasSpecialChar(newPassword) || !noUserName(newPassword) || isOldPassword(newPassword)){
            newPassword = getNewPassword();
        }
        System.out.println("The new password is: " + newPassword);
    }
    
    public static void printOldInfo(){
        System.out.printf("Old info%nUsername: %s%nPassword: %s%n", oldUsername, oldPassword);
    }
    
    public static String getNewPassword(){
        System.out.print("\nEnter the new password: ");
        String password = input.next();
        return password;
    }
    
    public static boolean hasEightChar(String password){
        if(password.length() < 8){
            System.out.println("New password must be at least 8 characters long!");
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean hasUppercase(String password){
        int uppercase_count = 0;
        for(int i = 0; i < password.length(); i++){
            if (Character.isUpperCase(password.charAt(i))){
                uppercase_count++;
            }
        }
        if (uppercase_count < 1){
            System.out.println("New password must contain an uppercase letter!");
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean hasSpecialChar(String password){
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(password);
        boolean b = m.find();
        if (!b){
            System.out.println("New password must contain a special character!");
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean noUserName(String password){
        if (password.contains(oldUsername)){
            System.out.println("New password must not contain the username!");
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean isOldPassword(String password){
        if (password.equals(oldPassword)){
            System.out.println("New password must be different from the old password!");
            return true;
        } else {
            return false;
        }
    }
}
