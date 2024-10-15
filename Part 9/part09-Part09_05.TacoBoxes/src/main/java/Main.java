
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        TripleTacoBox triple = new TripleTacoBox();
        CustomTacoBox custom = new CustomTacoBox(6);
        
        for(int i = 0; i < 7; i++) {
            custom.eat();
            triple.eat();
        }
        System.out.println(custom.tacosRemaining());
        System.out.println(triple.tacosRemaining()); 
    }
}
