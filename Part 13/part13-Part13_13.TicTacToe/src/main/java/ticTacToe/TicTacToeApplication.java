package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class TicTacToeApplication extends Application {
    private Game ticTacToe;
    
    


    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }
    
    @Override
    public void init() throws Exception {
        ticTacToe = new Game();
    } 

    @Override
    public void start(Stage window) {
        GameInterface gameScene = new GameInterface(ticTacToe);
        Scene gameView = new Scene(gameScene.getGameView(), 800, 600);
        window.setScene(gameView);
        window.show();
        
    }

}
