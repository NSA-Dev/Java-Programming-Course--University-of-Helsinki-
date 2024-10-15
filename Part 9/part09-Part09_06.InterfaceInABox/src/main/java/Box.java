
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
public class Box implements Packable{

    private ArrayList<Packable> contents;
    private double capacity;

    public Box(double capacity) {
        contents = new ArrayList<Packable>();
        this.capacity = capacity;
    }

    public void add(Packable item) {
        if (item.weight() <= capacity) {
            contents.add(item);
            capacity -= item.weight();
        }
    }

    public double weight() {

        double weight = 0;
        for (Packable item : contents) {
            weight += item.weight();
        }

        return weight;
    }

    public String toString() {
        return ("Box: " + contents.size()
                + " items, total weight "
                + this.weight() + " kg");
    }

}
