
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        
        int left, right;
        System.out.println("From where?");
        left = scanner.nextInt();
        System.out.println("To where?");
        right = scanner.nextInt();
        
        // scan array within the indices
        for(int i = left; i <= right; i++) {
            System.out.println(numbers.get(i));
        }
        
    }
}
