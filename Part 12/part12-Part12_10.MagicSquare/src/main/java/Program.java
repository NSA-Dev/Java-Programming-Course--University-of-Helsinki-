
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        MagicSquare ms = new MagicSquare(3);
        System.out.println(ms.sumsOfRows());
        MagicSquareFactory msFactory = new MagicSquareFactory();
        System.out.println(msFactory.createMagicSquare(5));
    }
}
