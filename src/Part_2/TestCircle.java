package Part_2;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println();
        System.out.println("The circle has radius of " + circle.getRadius() + " and area of " +
                circle.getArea());
        Circle circle1 = new Circle(80);

        System.out.println("The circle has radius of " + circle1.getRadius() + " and area of " +
                circle1.getArea());

        Circle circle2 = new Circle(100,"Black");
        System.out.println("The circle has radius of " + circle2.getRadius() + " and area of " +
                circle2.getArea());
    }
}
