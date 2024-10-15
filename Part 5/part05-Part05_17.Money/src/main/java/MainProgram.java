
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money a = new Money(1, 0);
        Money b = new Money(2, 30);
        Money c = new Money(-3, 5);

        System.out.println(c.lessThan(a));  // false
        System.out.println(b.lessThan(c));  // true
    }
}
