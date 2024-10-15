package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application{


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage window){
        VBox components = new VBox();
        components.setSpacing(2); 
        
        // component init
        TextField tField = new TextField();
        Button updateButton = new Button("Update");
        Label tLabel = new Label();
        // event handling
        updateButton.setOnAction((event) -> {
            tLabel.setText(tField.getText()); 
        });
        
        //Scene prep
        components.getChildren().addAll(tField, updateButton, tLabel); 
        Scene scene = new Scene(components);
        
        //window set
        window.setScene(scene);
        window.show(); 
        
    }

}
