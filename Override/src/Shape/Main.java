package Shape;

public class Main {
    public static void main(String[] args) {

        Square square = new Square("5 cm", "5 cm");
        Circle circle = new Circle("6 diameter", "6 diameter");

     circle.All_sides_equal();
        System.out.println(square.Length);
        System.out.println(circle.Length);

    }
}
