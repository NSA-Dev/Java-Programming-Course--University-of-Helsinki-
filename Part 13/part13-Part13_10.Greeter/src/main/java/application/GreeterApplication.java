package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage window) {
        //Start page
        //components
        Label userInstruction = new Label("Enter your name and start.");
        TextField nameField = new TextField();
        Button startButton = new Button("Start");
        //layout compositon
        GridPane layoutStart = new GridPane();
        layoutStart.add(userInstruction, 0, 0);
        layoutStart.add(nameField, 0, 1);
        layoutStart.add(startButton, 0, 2);
        //layout settings
        layoutStart.setPrefSize(300, 180);
        layoutStart.setAlignment(Pos.CENTER);
        layoutStart.setVgap(10);
        layoutStart.setVgap(10);
        layoutStart.setHgap(10);
        layoutStart.setPadding(new Insets(20, 20, 20, 20));
        // Start Scene
        Scene startPage = new Scene(layoutStart); 
        
        //greetings page
        Label greetingsText = new Label();
        
        StackPane greetingsLayout = new StackPane();
        greetingsLayout.setPrefSize(300,180);
        greetingsLayout.getChildren().add(greetingsText);
        greetingsLayout.setAlignment(Pos.CENTER);
        Scene greetingsPage = new Scene(greetingsLayout);


    // start event handling    
        
        startButton.setOnAction((event) -> {
            if(!nameField.getText().isEmpty()) {
                String name = nameField.getText(); 
                greetingsText.setText("Welcome " 
                + name + "!");
                window.setScene(greetingsPage);
                 
            }
              
        
        });

        window.setScene(startPage);
        window.show();

        

    }
}
