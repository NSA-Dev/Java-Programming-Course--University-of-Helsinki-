
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */
public class Employees {
    private List<Person> emplList;
    
    
    public Employees() {
        emplList = new ArrayList<Person>();
        
    }
    
    public void add(Person personToAdd) {
        emplList.add(personToAdd); 
    }
    
    public void add(List<Person> peopleToAdd) {
        emplList.addAll(peopleToAdd); 
    }
    
    public void print() {
        Iterator<Person> iterator = emplList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = emplList.iterator();
        while(iterator.hasNext()) {
            Person compared = iterator.next();
            if(compared.getEducation() == education) {
                System.out.println(compared);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = emplList.iterator();
        while(iterator.hasNext()) {
            if(iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
