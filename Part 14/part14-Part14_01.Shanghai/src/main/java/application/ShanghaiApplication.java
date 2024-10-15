package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

    @Override
    public void start(Stage window)  {
        
        //axis (x,y)
        NumberAxis xAxis = new NumberAxis(2006, 2018, 4);
        NumberAxis yAxis = new NumberAxis(0, 100, 10);
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking"); 
        
        //line chart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Universty of Helsinki, Shanghai ranking");
        
        
        
        //data propogation
        XYChart.Series shanghData = new XYChart.Series();
        shanghData.getData().add(new XYChart.Data(2007, 73));
        shanghData.getData().add(new XYChart.Data(2008, 68));
        shanghData.getData().add(new XYChart.Data(2009, 72));
        shanghData.getData().add(new XYChart.Data(2010, 72));
        shanghData.getData().add(new XYChart.Data(2011, 74));
        shanghData.getData().add(new XYChart.Data(2012, 73));
        shanghData.getData().add(new XYChart.Data(2013, 76));
        shanghData.getData().add(new XYChart.Data(2014, 73));
        shanghData.getData().add(new XYChart.Data(2015, 67));
        shanghData.getData().add(new XYChart.Data(2016, 56));
        shanghData.getData().add(new XYChart.Data(2017, 56));
        lineChart.getData().add(shanghData);
        
        //display
        Scene dataView = new Scene(lineChart, 640, 480);
        window.setScene(dataView);
        window.show(); 
        
        
    }

}
