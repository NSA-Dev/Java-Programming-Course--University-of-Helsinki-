/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */
public class Person {
    private String name;
    private Education education;
    
    public Person(String name, Education edu) {
        this.name = name;
        education = edu; 
    }
    
    public Education getEducation() {
        return education; 
    }
    
    public String toString() {
        return name + ", "
                + education; 
    }
}
