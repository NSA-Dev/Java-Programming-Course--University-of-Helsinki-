package title;

import java.util.Scanner;
import javafx.application.Application;


public class Main {

    public static void main(String[] args) {
        System.out.println("Title?");
        Scanner input = new Scanner(System.in); 
        String usrTitle = input.nextLine();
        Application.launch(UserTitle.class, "--title="+usrTitle);

    }

}
