
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
public class TodoList {

    private ArrayList<String> tasks;

    public TodoList() {
        tasks = new ArrayList<String>();
    }

    public void add(String task) {
        tasks.add(task);
    }

    public void print() {
        if (!tasks.isEmpty()) {
            int index = 1;
            for (String task : tasks) {
                System.out.println(index + ": " + task);
                index++;
            }
        }
    }

    public void remove(int number) {
        if (!tasks.isEmpty()) {
            tasks.remove(number - 1);
        }
    }

}
