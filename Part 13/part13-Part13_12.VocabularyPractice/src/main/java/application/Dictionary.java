/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author Nikita
 */
public class Dictionary {

    private List<String> words;
    private Map<String, String> entries;

    public Dictionary() {
        words = new ArrayList<>();
        entries = new HashMap<>();
        addWord("sana", "word"); 
    }

    public String getWord(String word) {
        return entries.get(word);
    }

    public void addWord(String word, String translation) {
        if (!entries.containsKey(word)) {
            words.add(word);
        }
        entries.put(word, translation);
    }

    public String getRandomWord() {
        Random r = new Random();
        return words.get(r.nextInt(words.size()));
    }

}
