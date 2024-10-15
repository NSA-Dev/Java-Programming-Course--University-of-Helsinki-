/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Nikita
 */
public class Calculator {
    private double balance;
    private double[] savings;
    private double[] savingsInterest; 
    
    public Calculator() {
        balance = 0;
        savings = new double[31];
        savingsInterest = new double[31];
    }
    
    
    public void deposit(double amount) {
        balance = amount;
        updateProjections(); 
    }
    
    public void calculateInterest(double percent) {
        double yearlyInterest = 1 + (percent/100.0);
        double baseValue = savings[1]; 
        for(int i = 1; i < savingsInterest.length; i++) {
            savingsInterest[i] 
                    = (baseValue + savingsInterest[i-1]) * yearlyInterest;
        }
    }
    
    private void updateProjections() {
       for(int i = 0; i < savings.length; i++) {
           savings[i] = balance * i * 12; 
       }
    }
    
    public double getSavingsByYear(int year) {
        if(year >= 0 || year < savings.length) {
            return savings[year]; 
        }
        return 0;    
    }
        
    public double[] getSavings() {
        return savings; 
    }
    
    public double[] getInterest() {
        return savingsInterest; 
    }
    
    
    
    
    
    
}
