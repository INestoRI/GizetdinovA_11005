public class Rectangle extends Shape {
    private double area;

    public Rectangle(double a, double b) {
        this.area = a * b;
    }

    @Override
    public double getArea() {
        return this.area;
    }
}
