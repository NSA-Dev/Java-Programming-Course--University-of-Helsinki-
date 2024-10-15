
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        ArrayList <Book> bookLib = new ArrayList<Book>(); 
        Scanner scanner = new Scanner(System.in);
        
        // input processing 
        while(true) {
            System.out.println("Input the name of the book, empty stops:");
            String name = scanner.nextLine(); 
            if(name.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation:");
            int age = Integer.valueOf(scanner.nextLine());
            bookLib.add(new Book(name, age));
        }
        // count books
        System.out.println(bookLib.size() 
                + " books in total.");
        //sorting
        Comparator<Book> comparator = Comparator
                .comparing(Book::getTargetAge)
                .thenComparing(Book::getBookName); 
        Collections.sort(bookLib, comparator); 
        
        //printer
        System.out.println("Books:");
        for(Book b: bookLib) {
            System.out.println(b);
        }
    }

}
