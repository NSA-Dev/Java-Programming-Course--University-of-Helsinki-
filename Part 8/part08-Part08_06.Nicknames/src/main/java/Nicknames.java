
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap <String, String> nicknames = 
                new HashMap<String, String>();
        
        nicknames.put("Matthew", "Matt");
        nicknames.put("Michael", "Dork");
        nicknames.put("Arthur", "Ahti");
        
        System.out.println(nicknames.get("Matthew"));
        
    }

}
