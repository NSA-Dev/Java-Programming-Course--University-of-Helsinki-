/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Nikita
 */
public class PracticeView {

    private Dictionary dictionary;
    private String word;

    public PracticeView(Dictionary dictionary) {
        this.dictionary = dictionary;
        word = dictionary.getRandomWord();
    }

    public Parent getView() {
        GridPane layout = new GridPane();

        // component creation
        Label wordInstruction = new Label("Translate the word '"
                + word + "'");
        TextField wordField = new TextField();
        Label translationInstruction = new Label("Translation");
        TextField translationField = new TextField();
        Button checkButton = new Button("Check");
        Label feedback = new Label("");

        //layout settings
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));

        //layout composition
        layout.add(wordInstruction, 0, 0);
        layout.add(translationField, 0, 1);
        layout.add(checkButton, 0, 2);
        layout.add(feedback, 0, 3);

        //button logic
        checkButton.setOnMouseClicked((event) -> {
            String translation = translationField.getText();
            if (dictionary.getWord(word).equals(translation)) {
                feedback.setText("Correct!");
            } else {
                feedback.setText("Incorrect! Correct translation "
                        + "was: " + dictionary.getWord(word));
                return;
            }
            word = dictionary.getRandomWord();
            wordInstruction.setText("Translate the word '"
                    + word + "'");
            translationField.clear();

        });
        return layout;

    }

}
