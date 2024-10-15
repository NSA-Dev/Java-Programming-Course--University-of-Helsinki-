
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String printOutput, listedElements;

        printOutput = "The collection " + this.name;
        listedElements = "";

        if (this.elements.isEmpty()) {
            return printOutput + " is empty.";
        } else {
            int collectionSize = elements.size();
            for (String element : this.elements) {
                listedElements = listedElements + "\n"+ element;
            }
            // Note: two cases because of output format (plural form of element)
            if (collectionSize > 1) {
                return printOutput + " has " + collectionSize
                        + " elements:" + listedElements;
            } else {
                return printOutput + " has " + collectionSize
                        + " element:" + listedElements;
            }
        }
    }

}
