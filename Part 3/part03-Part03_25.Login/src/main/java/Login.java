
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] usrNames = {{"alex"},{"emma"}};  
        String[][] passwords = {{"sunshine"},{"haskell"}};
        String login;
        String password;
        int loginMatch, passwordMatch; 
        loginMatch = passwordMatch = 0; 
        
        System.out.println("Enter username:");
        login = scanner.nextLine();
        System.out.println("Enter password:");
        password = scanner.nextLine();
        
        // check login
        for(String[] row : usrNames) {
            for(String name : row) {
                if(login.equals(name)){
                    loginMatch = 1; 
                }
            }
        }
        // check password
        for(String[] row : passwords) {
            for(String pass : row) {
                if(password.equals(pass)) {
                    passwordMatch = 1; 
                }
            }
        }
        
        if(loginMatch == 1 && passwordMatch == 1) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
        
        
    }
}
