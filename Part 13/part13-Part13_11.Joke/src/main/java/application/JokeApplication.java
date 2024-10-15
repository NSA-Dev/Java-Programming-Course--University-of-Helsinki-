package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {


    public static void main(String[] args) {
        launch(JokeApplication.class);
    }

    @Override
    public void start(Stage window){
        //main layout
        BorderPane layout = new BorderPane(); 
        // menu
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        //menu buttons
        Button jokeButton = new Button("Joke"); 
        Button answerButton = new Button("Answer"); 
        Button explainButton = new Button("Explanation");
        menu.getChildren().addAll(jokeButton, 
                answerButton, explainButton);
        layout.setTop(menu);
        //subviews
        StackPane questionView = createView("What do you call a bear with no teeth?");
        StackPane answerView = createView("A gummy bear.");
        StackPane explainView = createView("Gummy - as in gums you know?"); 
        //button logic
        jokeButton.setOnAction((event) -> layout.setCenter(questionView));
        answerButton.setOnAction((event) -> layout.setCenter(answerView));
        explainButton.setOnAction((event) -> layout.setCenter(explainView));
        //initial view
        layout.setCenter(questionView);
        //Create scene and show
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show(); 
    }
    
     private StackPane createView(String text) {

        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }
}
