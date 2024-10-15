package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class); 
    }

    @Override
    public void start(Stage window) {

        
        
        // third Scene
        GridPane layoutT = new GridPane();
        Label thirdText = new Label("Third view!");
        Button toggleFirst = new Button("To the first view!");
       
        layoutT.add(thirdText, 0, 0);
        layoutT.add(toggleFirst, 1, 1);
        Scene thirdScene = new Scene(layoutT); 

        //second Scene
        VBox layoutS = new VBox();
        layoutS.setSpacing(5);
        Button toggleThird = new Button("To the third view!");
        toggleThird.setOnAction((event) -> {
            window.setScene(thirdScene);
        });
        Label secondText = new Label("Second view!");
        layoutS.getChildren().add(toggleThird);
        layoutS.getChildren().add(secondText);

        Scene secondScene = new Scene(layoutS);

        //first Scene
        BorderPane layoutF = new BorderPane();
        Label firstText = new Label("First view!");
        Button toggleSecond = new Button("To the second view!");
        toggleSecond.setOnAction((event) -> {
            window.setScene(secondScene);
        });
        layoutF.setTop(firstText);
        layoutF.setCenter(toggleSecond);

        Scene firstScene = new Scene(layoutF);
         toggleFirst.setOnAction((event) -> {
            window.setScene(firstScene);
        });

        window.setScene(firstScene);
        window.show();

    }

}
