package abstract_interface;

public class Circle extends Shape implements Drawable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        System.out.println("The area of the circle is: " + Math.PI * radius * radius);
        return 0;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }

}
