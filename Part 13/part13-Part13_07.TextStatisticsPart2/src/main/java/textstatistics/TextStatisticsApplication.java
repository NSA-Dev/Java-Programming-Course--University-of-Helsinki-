package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        // adding text box
        TextArea textAreaComp = new TextArea();
        layout.setCenter(textAreaComp);
        // Labels init
        Label lettersL = new Label("Letters: 0");
        Label wordsL = new Label("Words: 0");
        Label longestL = new Label("The longest word is:");
        // adding texts
        HBox textComps = new HBox();
        textComps.setSpacing(10);
        textComps.getChildren().add(lettersL);
        textComps.getChildren().add(wordsL);
        textComps.getChildren().add(longestL);
        layout.setBottom(textComps);
        //listener
        textAreaComp.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = (newValue.isEmpty()) ? 0 : parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            lettersL.setText("Letters: " + characters);
            wordsL.setText("Words: " + words);
            longestL.setText("The longest word is: " + longest); 

        });

        //draw scene, display window
        Scene view = new Scene(layout);
        window.setScene(view);
        window.setTitle("Text analyzer");
        window.show();

    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
