public class Triangle extends Shape {
    private double area;

    public Triangle(double a, double h) {
        this.area = (a * h) / 2;
    }

    @Override
    public double getArea() {
        return this.area;
    }
}
