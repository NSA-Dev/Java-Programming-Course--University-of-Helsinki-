
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input;
        
        while(!(input = scanner.nextLine()).equals("")) {
            String[] cut = input.split(" ");
            for(int i = 0; i < cut.length; i++) {
                System.out.println(cut[i]);
            }
        }
       

    }
}
