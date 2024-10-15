/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory balanceLog;
    

    public ProductWarehouseWithHistory(String productName,
            double capacity, double initialBalance) {
        super(productName, capacity);
        balanceLog = new ChangeHistory();
        balanceLog.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }
    
    public String history() {
        return balanceLog.toString();
    }
    
    @Override
    public void addToWarehouse(double amount) {
           super.addToWarehouse(amount);
           balanceLog.add(super.getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);
        balanceLog.add(super.getBalance());
        return taken; 
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " 
                + balanceLog.maxValue());
        System.out.println("Smallest amount of product: " 
                + balanceLog.minValue());
        System.out.println("Average: " + balanceLog.average());
    }
}
