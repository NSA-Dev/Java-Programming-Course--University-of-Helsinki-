/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Nikita
 */
public class SaveableDictionary {

    private ArrayList<String> entries, translations;
    private String filePath;

    public SaveableDictionary() {
        filePath = "temp.txt"; 
        entries = new ArrayList<>();
        translations = new ArrayList<>();
    }

    public SaveableDictionary(String file) {
        filePath = file;
        entries = new ArrayList<>();
        translations = new ArrayList<>();
    }

    public void add(String words, String translation) {
        if (!entries.contains(words)
                && !translations.contains(translation)) {
            entries.add(words);
            translations.add(translation);
        }

    }

    public String translate(String word) {
        if (entries.contains(word)) {
            int index = entries.indexOf(word);
            return translations.get(index);
        } else if (translations.contains(word)) {
            int index = translations.indexOf(word);
            return entries.get(index);
        }
        return null;
    }

    public void delete(String word) {
        if (entries.contains(word)) {
            int index = entries.indexOf(word);
            entries.remove(index);
            translations.remove(index);
        } else if (translations.contains(word)) {
            int index = translations.indexOf(word);
            entries.remove(index);
            translations.remove(index);
        }
    }

    public boolean load() {
        try ( Scanner fileReader = new Scanner(Paths.get(filePath))) {
            while(fileReader.hasNextLine()) {
                String line = fileReader.nextLine(); 
                String[] parts = line.split(":");
                entries.add(parts[0]);
                translations.add(parts[1]);
            }
            return true; 
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean save() {
        try {  
            PrintWriter writer = new PrintWriter(filePath);
            // sanity check
            if (entries.size() != translations.size()) {
                return false; 
            }
            // writing to the file provided
            for(int i = 0; i < entries.size(); i++) {
                writer.print(entries.get(i));
                writer.print(":");
                writer.println(translations.get(i)); 
            }
            
            writer.close();  
            return true; 
        } catch (FileNotFoundException ex) {
            return false; 
        }
    }

}
