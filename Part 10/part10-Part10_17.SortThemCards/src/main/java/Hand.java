
import java.util.ArrayList;
import java.util.Collections;
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
public class Hand implements Comparable <Hand> {
    private List <Card> playerHand;
    
    public Hand() {
        playerHand = new ArrayList<Card>();
    }
    
    public void add(Card card) {
        playerHand.add(card);
    }
    
    public void print() {
        for(Card card: playerHand) {
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(playerHand);
    }
    
    public int getValue() {
        int value = 0;
        for(Card c: playerHand) {
            value += c.getValue();
        }
        return value;
    }

    @Override
    public int compareTo(Hand other) {
        return this.getValue() - other.getValue(); 
    }
    
    public void sortBySuit() {
        Collections.sort(playerHand, new BySuitInValueOrder());
    }
}
