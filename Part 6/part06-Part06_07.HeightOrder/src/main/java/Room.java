/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> personList;

    public Room() {
        this.personList = new ArrayList();
    }

    public void add(Person person) {
        this.personList.add(person);
    }

    public boolean isEmpty() {
        return this.personList.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        if (this.personList.isEmpty()) {
            return null;
        }
        return this.personList;
    }

    public Person shortest() {
        Person shortest;

        if (this.personList.isEmpty()) {
            return null;
        }

        shortest = this.personList.get(0);
        for (Person person : personList) {
            if (shortest.getHeight() > person.getHeight()) {
                shortest = person;
            }
        }

        return shortest;

    }

    public Person take() {
        Person shortest = this.shortest();

        if (shortest != null) {
            this.personList.remove(shortest);
            return shortest;
        } else {
            return null;
        }
    }

}
