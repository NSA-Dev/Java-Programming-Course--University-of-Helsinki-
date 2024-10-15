
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nikita
 */
public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if(registry.containsKey(licensePlate) 
                && registry.get(licensePlate) != null) {
            return false; 
        }
        registry.put(licensePlate, owner);
        return true; 
        
    }

    public String get(LicensePlate licensePlate) {
        if (registry.containsKey(licensePlate)) {
            return registry.get(licensePlate);
        }

        return null;

    }

    public boolean remove(LicensePlate licensePlate) {
        if (registry.containsKey(licensePlate)) {
            registry.remove(licensePlate);
            return true;
        }

        return false;
    }
    
    public void printLicensePlates() {
        for(LicensePlate plateKey : registry.keySet()) {
            System.out.println(plateKey);
        }
    }
    
    public void printOwners() {
        
        ArrayList <String> ownerNames = new ArrayList<>();  
        for(LicensePlate plateKey : registry.keySet()) {
            String tempName = registry.get(plateKey);
            if(!ownerNames.contains(tempName)) {
                ownerNames.add(tempName);
                System.out.println(tempName);
            }
            
        }
    }

}
