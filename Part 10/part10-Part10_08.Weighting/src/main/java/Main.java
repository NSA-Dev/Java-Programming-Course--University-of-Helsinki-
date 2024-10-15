

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        Hold test = new Hold(300);
        
        Suitcase cargo1 = new Suitcase(20);
        Suitcase cargo2 = new Suitcase(20);
        Suitcase cargo3 = new Suitcase(20);
        
        cargo1.addItem(new Item("Lsock", 5));
        cargo1.addItem(new Item("Rsock", 5));
        cargo1.addItem(new Item("Cocainer", 10));
        
        cargo2.addItem(new Item("Lsock", 5));
        cargo2.addItem(new Item("Rsock", 5));
        cargo2.addItem(new Item("Cocainer", 10));
        
        cargo3.addItem(new Item("Lsock", 5));
        cargo3.addItem(new Item("Rsock", 5));
        cargo3.addItem(new Item("Cocainer", 10));
        
        test.addSuitcase(cargo1);
        test.addSuitcase(cargo2);
        test.addSuitcase(cargo3);
        
        System.out.println("TW: " + test.totalWeight());
        
    }
    
}
