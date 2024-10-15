
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        //declarations
        Scanner scan = new Scanner(System.in);
        String[] lineSplit;
        String fileName, teamName;
        int gamesCount, wins, losses, homePoints, visitngPoints;
        // initialize
        gamesCount = wins = losses = 0;

        // User input 
        System.out.println("File:");
        fileName = scan.nextLine();
        System.out.println("Team:");
        teamName = scan.nextLine();

        //file handling 
        try ( Scanner fileScan = new Scanner(Paths.get(fileName))) {
            while (fileScan.hasNextLine()) {
                lineSplit = (fileScan.nextLine()).split(",");
                if (lineSplit[0].equals(teamName)) {
                    gamesCount++;
                    homePoints = Integer.valueOf(lineSplit[2]);
                    visitngPoints = Integer.valueOf(lineSplit[3]);
                    if(homePoints > visitngPoints) {
                        wins++;
                    } else {
                        losses++; 
                    }
                } else if (lineSplit[1].equals(teamName)) {
                    gamesCount++;
                    homePoints = Integer.valueOf(lineSplit[2]);
                    visitngPoints = Integer.valueOf(lineSplit[3]);
                    if(visitngPoints > homePoints) {
                        wins++;
                    } else {
                        losses++; 
                    } 
                }
            }
        } catch (Exception fileErr) {
            System.out.println("Error:" + fileErr.getMessage());
        }

        //Results
        System.out.println("Games: " + gamesCount);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
