/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Iterator;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author Nikita
 */
public class UserInterface {

    private Calculator calculator;
    private NumberAxis xAxis, yAxis;
    private LineChart<Number, Number> lineChart;

    public UserInterface() {
        calculator = new Calculator();
        xAxis = new NumberAxis(0, 30, 4);
        NumberAxis yAxis = new NumberAxis();
        lineChart = new LineChart<>(xAxis, yAxis);

    }

    public Parent getCalcView() {
        BorderPane layout = new BorderPane();

        //components - line chart
        lineChart.setTitle("Savings");

        //components - VBOX (contains two BorderPanes)
        VBox dashboard = new VBox();
        dashboard.setPadding(new Insets(10, 10, 10, 10));
        dashboard.setSpacing(5);
        BorderPane dashTop = new BorderPane();
        BorderPane dashBot = new BorderPane();
        //components - dashTop
        Label topText = new Label("Monthly savings");
        Label sliderStateTop = new Label("25");
        Slider savingsSlider = new Slider(25, 250, 25);
        savingsSlider.setShowTickMarks(true);
        savingsSlider.setShowTickLabels(true);
        dashTop.setLeft(topText);
        dashTop.setCenter(savingsSlider);
        dashTop.setRight(sliderStateTop);

        //components - dashBot
        Label botText = new Label("Yearly interest rate");
        Label sliderStateBot = new Label("0");
        Slider interestSlider = new Slider(0, 10.0, 1.0);
        interestSlider.setShowTickLabels(true);
        dashBot.setLeft(botText);
        dashBot.setCenter(interestSlider);
        dashBot.setRight(sliderStateBot);

        //Component logic
        //inital state
        calculator.deposit(25.0);
        XYChart.Series savingsData = new XYChart.Series();
        savingsData.setName("Savings");
        double[] initialSet = calculator.getSavings();
        for (int i = 0; i < initialSet.length; i++) {
            savingsData.getData().add(new XYChart.Data(i, initialSet[i])); 
        }
        lineChart.getData().add(savingsData);
                
        //savings slider
        savingsSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
                int currentReading = (int) savingsSlider.getValue();
                sliderStateTop.setText(Integer.toString(currentReading));
                calculator.deposit((double) currentReading);
                XYChart.Series savingsData = new XYChart.Series();
                savingsData.setName("Savings");
                double[] currentSet = calculator.getSavings();
                for (int i = 0; i < currentSet.length; i++) {
                    savingsData.getData().add(new XYChart.Data(i, currentSet[i]));
                }
                removeOldData("Savings"); 
                lineChart.getData().add(savingsData);

            }

        });
        //Interest slider
        interestSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
                double interestReading = (double) interestSlider.getValue();
                sliderStateBot.setText(Double.toString(interestReading));
                calculator.calculateInterest(interestReading);
                XYChart.Series interestData = new XYChart.Series();
                interestData.setName("Interest");
                double[] currentIntSet = calculator.getInterest();
                for (int i = 0; i < currentIntSet.length; i++) {
                    interestData.getData().add(new XYChart.Data(i, currentIntSet[i]));
                }
                removeOldData("Interest"); 
                lineChart.getData().add(interestData);
            }

        });

        //layout composition
        dashboard.getChildren().add(dashTop);
        dashboard.getChildren().add(dashBot);
        layout.setTop(dashboard);
        layout.setCenter(lineChart);

        return layout;

    }

    private void removeOldData(String setName) {
        // Use iterator to avoid ConcurrentModificationException while removing elements
        Iterator<XYChart.Series<Number, Number>> seriesIterator = lineChart.getData().iterator();
        while (seriesIterator.hasNext()) {
            XYChart.Series<Number, Number> series = seriesIterator.next();
            // Check if the series name is "Savings" (the name used for savings data)
            if (setName.equals(series.getName())) {
                seriesIterator.remove(); // Remove the series from the chart
            }
        }
    }



}
