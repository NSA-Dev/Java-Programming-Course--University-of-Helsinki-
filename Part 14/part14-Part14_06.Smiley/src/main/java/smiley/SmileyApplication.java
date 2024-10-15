package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        Canvas smileyCanvas = new Canvas(640, 480);
        GraphicsContext painter = smileyCanvas.getGraphicsContext2D();

        BorderPane layout = new BorderPane();
        
       
        //painting
        painter.setFill(Color.WHITE);
        painter.fill();
        painter.setFill(Color.BLACK);
        
        painter.fillRect(250, 100, 20, 20);
        painter.fillRect(330, 100, 20, 20);
        painter.fillRect(230, 160, 20, 20);
        
        //smile
        int x = 250;
        for(int i=0; i < 5; i++) {
            painter.fillRect(x, 180, 20, 20);
            x += 20; 
        } 
        painter.fillRect(x, 160, 20, 20);

        layout.setCenter(smileyCanvas);
        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

}
