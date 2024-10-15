package myFirstApplication;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.Scene;


public class MyFirstApplication extends Application{
    
    public void start(Stage window) {
        window.setTitle("My first application");
        Button button = new Button("I do nothing =(");
        FlowPane componentGroup = new FlowPane(); 
        componentGroup.getChildren().add(button);
        
        Scene scene = new Scene(componentGroup);
        
        window.setScene(scene);
        window.show(); 
    
    }
    public static void main(String[] args) {
        launch(MyFirstApplication.class); 
    }

}
