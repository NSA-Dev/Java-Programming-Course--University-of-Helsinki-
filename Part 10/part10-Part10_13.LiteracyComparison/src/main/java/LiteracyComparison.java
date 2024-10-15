
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList <String> litStats = new ArrayList<>(); 
        
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .sorted((p1, p2) -> Double.compare(Double.valueOf(p1[5]), Double.valueOf(p2[5])))
                    .map(parts -> (parts[3]
                            +" (" + parts[4] + "), " 
                            +parts[2].trim().split(" ")[0] 
                            +", " + parts[5]))
                    .forEach(line -> litStats.add(line));  
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
        
        for(String entry : litStats) {
            System.out.println(entry);
        }

    }

    
    
}
