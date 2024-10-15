

public class Checker {
    public boolean isDayOfWeek(String string) {
        if(string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        }
        return false; 
    }
    //charset is limited to lowercase in the ex. 
    public boolean allVowels(String string) {
        if(string.matches("[aeiou]*")) {
            return true; 
        }
        return false; 
    }
    // TIP: account for each digit individually
    // OR cases should use brackets ()
    public boolean timeOfDay(String string) {
        if(string.matches("([0-1][0-9]|2[0-3])"
                + ":[0-5][0-9]"
                + ":[0-5][0-9]")) {
            return true; 
        }
        return false;
    }
    

}
