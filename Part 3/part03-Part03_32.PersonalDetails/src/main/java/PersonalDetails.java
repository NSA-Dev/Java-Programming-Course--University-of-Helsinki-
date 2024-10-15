
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input, longestName; 
        int count, sum, longest;
        double average; 
        count = sum = longest = 0;
        longestName = ""; 
        
        while (!(input = scanner.nextLine()).equals("")) {
            String[] nameBirthYearCSV = input.split(",");
            count++;
            sum += Integer.valueOf(nameBirthYearCSV[1]); 
            if (((nameBirthYearCSV[0].length()) > longest)) {
                longest = nameBirthYearCSV[0].length();
                longestName = nameBirthYearCSV[0]; 
            }
        }
        average = sum * 1.0 / count; 
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);

    }
}
