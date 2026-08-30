import java.util.Scanner;

class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this(1, 1);
        System.out.println("No-argument constructor called");
    }

    public Rectangle(double size) {
        this(size, size);
        System.out.println("One-argument constructor called");
    }

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0)
            throw new IllegalArgumentException("Dimensions must be positive");

        this.width = width;
        this.height = height;

        System.out.println("Two-argument constructor called");
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean isSquare() {
        return width == height;
    }

    public void scale(double factor) {
        if (factor > 0) {
            width *= factor;
            height *= factor;
        }
    }

    public String toString() {
        return "Width: " + width + ", Height: " + height;
    }
}

public class RectangleModel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. No-argument rectangle");
        Rectangle r1 = new Rectangle();

        System.out.print("\nEnter square size: ");
        double size = sc.nextDouble();
        Rectangle r2 = new Rectangle(size);

        System.out.print("\nEnter rectangle width: ");
        double width = sc.nextDouble();

        System.out.print("Enter rectangle height: ");
        double height = sc.nextDouble();

        Rectangle r3 = new Rectangle(width, height);

        System.out.println("\n" + r1);
        System.out.println("Area: " + r1.getArea());

        System.out.println("\n" + r2);
        System.out.println("Area: " + r2.getArea());

        System.out.println("\n" + r3);
        System.out.println("Area: " + r3.getArea());
        System.out.println("Perimeter: " + r3.getPerimeter());
        System.out.println("Is square: " + r3.isSquare());

        System.out.print("\nEnter scale factor: ");
        double factor = sc.nextDouble();

        r3.scale(factor);

        System.out.println("After scaling: " + r3);

        sc.close();
    }
}
