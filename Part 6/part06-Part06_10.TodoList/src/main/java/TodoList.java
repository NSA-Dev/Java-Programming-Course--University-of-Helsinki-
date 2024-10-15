
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
        tasks = new ArrayList();
    }

    public void add(String task) {
        tasks.add(task);
    }

    public void print() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i+1) + ": " + tasks.get(i));
        }
    }

    public void remove(int index) {
        tasks.remove(index-1); // cause of 0,1,2 ... etc 
    }

}
