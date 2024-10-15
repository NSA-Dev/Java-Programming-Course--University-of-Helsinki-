
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nikita
 */
public class IOU {

    private HashMap<String, Double> debtLog;

    public IOU() {
        debtLog = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        debtLog.put(toWhom, amount);

    }

    public double howMuchDoIOweTo(String toWhom) {
        return debtLog.getOrDefault(toWhom, 0.0);
    }
}
