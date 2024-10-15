
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        Grader grades = new Grader(); 
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            } else {
                grades.addGrade(input);
            }

        }
        
        System.out.println("Point average (all): " + grades.average());
        System.out.println("Point average (passing): " + grades.averagePassing());
        System.out.println("Pass percentage: " + grades.passPercentage());
        grades.printGradeDistribution();
    }
}
