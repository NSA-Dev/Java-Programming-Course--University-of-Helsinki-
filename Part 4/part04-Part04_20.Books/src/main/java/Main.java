
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String title, printParam;
        int pages, publYear;

        while (true) {
            System.out.println("Title:");
            title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages:");
            pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year:");
            publYear = Integer.valueOf(scanner.nextLine());

            bookList.add(new Book(title, pages, publYear));
        }

        System.out.println("What information will be printed?");
        printParam = scanner.nextLine();

        switch (printParam) {

            case "everything":
                for (Book entry : bookList) {
                    System.out.println(entry.toString());
                }
                break;

            case "name":
                for (Book entry : bookList) {
                    System.out.println(entry.getTitle());
                }
                break;
            default:
                System.out.println("Unknown input. Options: everything/name");
                

        }

    }
}
