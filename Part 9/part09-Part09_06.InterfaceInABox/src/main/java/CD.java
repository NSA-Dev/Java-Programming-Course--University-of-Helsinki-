/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */
public class CD implements Packable {

    private String artist, name;
    private int pubYear;

    public CD(String artist, String name, int pubYear) {
        this.artist = artist;
        this.name = name;
        this.pubYear = pubYear;
    }

    public String toString() {
        return (artist + ": "
                + name + " (" + pubYear + ")");
    }

    @Override
    public double weight() {
        return 0.1; // default cd weight  
    }

}
