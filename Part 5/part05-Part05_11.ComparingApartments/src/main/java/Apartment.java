
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        int area, areaCompared;
        
        area = this.rooms * (this.squares * this.squares);
        areaCompared = compared.rooms * (compared.squares * compared.squares);
        
        if(area > areaCompared) {
            return true;
        } else {
            return false; 
        }  
    }
    
    public int priceDifference(Apartment compared) {
        int price, priceCompared;
        
        price = this.princePerSquare * this.squares; 
        priceCompared = compared.princePerSquare * compared.squares;
        
        return (Math.abs(price - priceCompared));
        
    
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int price, priceCompared; 
        
        price = this.squares * this.princePerSquare;
        priceCompared = compared.princePerSquare * compared.squares;
        
        if(price > priceCompared){
            return true; 
        } else {
            return false; 
        }
    }

}
