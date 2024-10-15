
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nikita
 */
public class BirdWatcher {

    private ArrayList<Bird> birdDB;

    public BirdWatcher() {
        birdDB = new ArrayList<Bird>();
    }
    
    
    
    public void startUI(Scanner iStream) {
        while(true) {
            System.out.println("?");
            String command = iStream.nextLine();
            if(command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                System.out.println("Name:");
                String BirdName = iStream.nextLine();
                System.out.println("Name in Latin:");
                String BirdLatName = iStream.nextLine();
                birdDB.add(new Bird(BirdName, BirdLatName)); 
            } else if (command.equals("Observation")) {
                System.out.println("Bird?");
                String searched = iStream.nextLine();
                int matchIndex = this.searchBird(searched);
                if(matchIndex != -1) {
                    birdDB.get(matchIndex).observe();
                } else {
                    System.out.println("Not a bird!");
                }
            } else if(command.equals("One")) {
                System.out.println("Bird?");
                String searched = iStream.nextLine();
                int matchIndex = this.searchBird(searched);
                if(matchIndex != -1) {
                    System.out.println(birdDB.get(matchIndex).toString());;
                } else {
                    System.out.println("Not a bird!");
                }
            } else if (command.equals("All")) {
                for(Bird b: birdDB) {
                    System.out.println(b.toString()); 
                }
            }
        }
        
    }
    
    public int searchBird(String bName) {
        int index = -1; 
        for(Bird b : birdDB) {
            index++;
            if(b.getName().equals(bName)) {
                return index;  
            }
        }
        return -1; 
    }

}
