package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {
    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }


    @Override
    public void start(Stage window) {
        UserInterface ui = new UserInterface();
        Scene mainView = new Scene(ui.getCalcView(), 320, 300);
        window.setScene(mainView);
        window.show();
        
    }

}
