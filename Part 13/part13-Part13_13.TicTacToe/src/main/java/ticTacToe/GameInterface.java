/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

/**
 *
 * @author Nikita
 */
public class GameInterface {

    private Game gameInstance;
    

    public GameInterface(Game gameInstance) {
        this.gameInstance = gameInstance;
    }

    public Parent getGameView() {
        BorderPane layout = new BorderPane();
        //components
        Label turnInfo = new Label("Turn: X");
        turnInfo.setFont(Font.font("Monospaced", 40));
        GridPane buttons = new GridPane();
        buttons.setHgap(10);
        buttons.setVgap(10);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button gameButton = new Button();
                gameButton.setFont(Font.font("Monospaced", 40));
                gameButton.setPrefSize(100, 100);
                addLogic(gameButton, j, i, turnInfo);
                buttons.add(gameButton, j, i);

            }
        }
        //layout settings & composition
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setCenter(buttons);
        layout.setTop(turnInfo);

        return layout;

    }

    private void addLogic(Button b, int x, int y, Label text) {
        b.setOnMouseClicked((event) -> {
            if (gameInstance.claimCell(x, y)) {
                b.setText("" + gameInstance.getPlayerSign());
                if (gameInstance.checkVictoryCondition()) {
                    text.setText(gameInstance.getPlayerSign() + " wins!");
                    gameInstance.terminateGame();
                    return;
                }
                gameInstance.switchPlayer();
                text.setText("Turn: " + gameInstance.getPlayerSign());
                
            }

        });

    }

}
