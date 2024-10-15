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

public class Stack {

    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public void add(String value) {
        this.stack.add(value);
    }

    public ArrayList<String> values() {
        ArrayList<String> values = new ArrayList(this.stack);
        return values;
    }

    public String take() {

        String pop = this.stack.get(this.stack.size() - 1);
        if (this.stack.size() == 0) {
            ;
        } else {
            this.stack.remove(this.stack.size() - 1);
        }
        return pop;

    }
}
