package buttonandlabel;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndLabelApplication extends Application {
    
    @Override
    public void start(Stage window) {
        
        // creating elements
        Button buttonComponent = new Button ("Button 1"); 
        Label textLabel = new Label("Text label");
        
        //grouping (order matters) 
        FlowPane components = new FlowPane();  
        components.getChildren().add(textLabel); 
        components.getChildren().add(buttonComponent);
        
        // send to scene, call window
        Scene view = new Scene(components); 
        window.setScene(view);
        window.show(); 
                
                
    }

    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class); 
    }

}
