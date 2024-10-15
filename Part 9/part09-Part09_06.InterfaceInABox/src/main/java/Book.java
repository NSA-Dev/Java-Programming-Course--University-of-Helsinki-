/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */
public class Book implements Packable {

    private String name, author;
    private double weight;

    public Book(String author, String title, double weight) {
        this.author = author;
        this.name = title;
        this.weight = weight;
    }

    public String toString() {
        return (author + ": "
                + name); 
    }

    @Override
    public double weight() {
        return weight;
    }

}
