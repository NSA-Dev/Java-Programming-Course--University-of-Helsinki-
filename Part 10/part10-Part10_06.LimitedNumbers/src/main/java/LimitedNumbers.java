
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numberSet = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (Integer.valueOf(input) < 0) {
                break;
            }
            numberSet.add(input); 
        }
        numberSet.stream()
                .mapToInt(num -> Integer.valueOf(num))
                .filter(num -> num >= 1 && num <= 5)
                .forEach(num -> System.out.println(num));

    }
}
