
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        // calculate top center
        int cellNum = size * size;
        int x = size / 2;
        int y = 0;
        int value = 1;

        for (int i = 0; i < cellNum; i++) {
            if (x > (size - 1)) {
                x = 0;
            }
            if (y < 0) {
                y = size - 1;
            }
            if (square.readValue(x, y) != 0) {
                y++;
                x--;
                if (y > size - 1) {
                    y = 0;
                }
                y++;
                if (y > size - 1) {
                    y = 0;
                }
                if(x < 0) {
                    x = size - 1; 
                }
            }
            square.placeValue(x, y, value);
            System.out.println("Placing: " + value + " into "
                    + "x: " + x
                    + " y: " + y);
            x++;
            y--;
            value++;
        }

        return square;
    }

}
