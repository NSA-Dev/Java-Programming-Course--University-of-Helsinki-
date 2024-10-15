package application;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

    @Override
    public void start(Stage window) throws IOException {
        //get data from the tsv
        int lineCount = 0;
        ArrayList<Integer> yearSet = new ArrayList<>();
        ArrayList<XYChart.Series> dataSet = new ArrayList<>();
        Scanner fileScan = new Scanner(Paths.get("partiesdata.tsv"));
        while (fileScan.hasNextLine()) {
            String line = fileScan.nextLine();
            String[] lineParts = line.split("\t");
            if (lineCount == 0) {
                for (int i = 1; i < lineParts.length; i++) {
                    int year = Integer.valueOf(lineParts[i]);
                    yearSet.add(year);
                    lineCount++;
                }
            } else {
                XYChart.Series partyData = new XYChart.Series();
                partyData.setName(lineParts[0]);
                for (int i = 1; i < lineParts.length; i++) {
                    int yearRecorded = yearSet.get(i - 1);
                    if(!lineParts[i].equals("-")) {
                    double percentage = Double.valueOf(lineParts[i]);
                    partyData.getData().add(new XYChart.Data(yearRecorded, percentage));
                    } else {
                        partyData.getData().add(new XYChart.Data(yearRecorded, 0));
                    }
                }
                dataSet.add(partyData);
                lineCount++;
            }
        }
        
        //Creating the chart
        //Axis
        int lowerBound, upperBound;
        lowerBound = yearSet.get(0);
        upperBound = yearSet.get(yearSet.size()-1); 
        NumberAxis xAxis = new NumberAxis(lowerBound,upperBound, 4); 
        NumberAxis yAxis = new NumberAxis();
        
        
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");
        //add data to the chart
        for(int i = 0; i < dataSet.size(); i++) {
            lineChart.getData().add(dataSet.get(i)); 
        }
        Scene chartView = new Scene(lineChart, 640, 480);
        window.setScene(chartView);
        window.show(); 
        
        
    }

}
