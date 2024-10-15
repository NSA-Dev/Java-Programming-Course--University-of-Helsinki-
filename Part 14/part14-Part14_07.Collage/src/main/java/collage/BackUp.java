/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collage;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Nikita
 */
public class BackUp {
 /*   package collage;

import java.util.ArrayList;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {

        // the example opens the image, creates a new image, and copies the opened image
        // into the new one, pixel by pixel
        // initial data 
        Pane pane = new Pane();
        Image sourceImg = new Image("file:monalisa.png");
        PixelReader pixelMap = sourceImg.getPixelReader();
        int width = (int) sourceImg.getWidth();
        int height = (int) sourceImg.getHeight();
        int widthSmall = width / 2;
        int heightSmall = height / 2;

        // targets
        WritableImage targetLarge = new WritableImage(width, height);
        WritableImage targetSmall = new WritableImage(widthSmall, heightSmall);

        //writers 
        PixelWriter writerLarge = targetLarge.getPixelWriter();
        PixelWriter writerSmall = targetSmall.getPixelWriter();

        // process large
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color pixelColor = pixelMap.getColor(x, y);
                double red = pixelColor.getRed();
                double green = pixelColor.getGreen();
                double blue = pixelColor.getBlue();
                double opacity = pixelColor.getOpacity();
                Color currentColor = new Color(red, green, blue, opacity);
                writerLarge.setColor(x, y, currentColor);
            }
        }

        //process small
        for (int y = 0; y < heightSmall; y++) {
            for (int x = 0; x < widthSmall; x++) {
                Color pixelColor = pixelMap.getColor(x * 2, y * 2);
                double red = pixelColor.getRed();
                double green = pixelColor.getGreen();
                double blue = pixelColor.getBlue();
                double opacity = pixelColor.getOpacity();
                Color currentColor = new Color(1.0 - red, 1.0 - green, 1.0 - blue, opacity);
                writerSmall.setColor(x, y, currentColor);
            }
        }
        
        
//        ImageView imageSmall = new ImageView(targetSmall);
        ImageView imageBase = new ImageView(targetLarge);
        pane.getChildren().add(imageBase);

        int xOffset = widthSmall; // 2.0;
        int yOffset = heightSmall; // 2.0);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                ImageView imageSmall = new ImageView(targetSmall);
                imageSmall.setLayoutX(j * xOffset);
                imageSmall.setLayoutY(i* yOffset);
                pane.getChildren().add(imageSmall);
            }
        }
        
        //pane.getChildren().add(imageSmall);

        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
    */
}
