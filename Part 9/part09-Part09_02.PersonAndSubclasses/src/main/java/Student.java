/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */
public class Student extends Person {

    private int creditPoints;

    public Student(String name, String address) {
        super(name, address);
        creditPoints = 0;
    }

    public void study() {
        creditPoints++;
    }

    public int credits() {
        return creditPoints;
    }
    
    public String toString() {
       return (super.toString() + "\n  Study credits " + creditPoints); 
    }

}
