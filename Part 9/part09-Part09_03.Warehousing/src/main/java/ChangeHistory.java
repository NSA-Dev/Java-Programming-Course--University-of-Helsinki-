
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nikita
 */
public class ChangeHistory {

    private ArrayList<Double> capacityLog;

    public ChangeHistory() {
        capacityLog = new ArrayList<Double>();
    }

    public void add(double status) {
        capacityLog.add(status);
    }

    public void clear() {
        capacityLog.clear();
    }

    public String toString() {
        return capacityLog.toString();
    }

    public double maxValue() {
        if (capacityLog.isEmpty()) {
            return 0.0;
        }
        double max = capacityLog.get(0);

        for (double val : capacityLog) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    public double minValue() {
        if (capacityLog.isEmpty()) {
            return 0.0;
        }
        double min = capacityLog.get(0);

        for (double val : capacityLog) {
            if (val < min) {
                min = val;
            }
        }
        return min;
    }
    
    public double average() {
        double sum = 0;
        for(double val : capacityLog) {
            sum += val; 
        }
        
        return sum / capacityLog.size(); 
    }

}
