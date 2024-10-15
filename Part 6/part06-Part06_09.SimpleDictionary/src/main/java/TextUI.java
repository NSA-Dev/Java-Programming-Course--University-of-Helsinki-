/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner inputStream, SimpleDictionary dictionary) {
        this.scanner = inputStream;
        this.dictionary = dictionary;
    }

    public void start() {
        String command, word, translation;
        while (true) {
            System.out.println("Command:");
            command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.println("Word:");
                word = scanner.nextLine();
                System.out.println("Translation:");
                translation = scanner.nextLine();
                this.dictionary.add(word, translation);
            } else if (command.equals("search")) {
                System.out.println("To be translated:");
                word = scanner.nextLine();
                translation = this.dictionary.translate(word);
                if (translation == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println("Translation:" + translation);
                }

            } else {
                System.out.println("Unknown command");
            }
        }

    }
}
