/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */
public class ArchiveItem {

    private String id, name;

    public ArchiveItem(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getId() {
        return id; 
    }
    
    public String getName() {
        return name; 
    }
    
    public boolean equals(Object compared) {
        if(this == compared) {
            return true; 
        }
        
        if (!(compared instanceof ArchiveItem)) {
            return false; 
        }
        
        ArchiveItem comparedItem = (ArchiveItem) compared; 
        
        if(this.id.equals(comparedItem.id) &&
                this.name.equals(comparedItem.name)) {
            return true; 
        }
        
        return false; 
    }

}
